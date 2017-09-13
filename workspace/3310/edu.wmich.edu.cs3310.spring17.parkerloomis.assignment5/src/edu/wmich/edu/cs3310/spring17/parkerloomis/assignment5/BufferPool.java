package edu.wmich.edu.cs3310.spring17.parkerloomis.assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://courses.cs.washington.edu/courses/cse451/08wi/BufferPool.java
// This class maintains a statically-allocated pool of memory buffers
/*The third approach is called least recently used (LRU). LRU simply keeps the buffers in a list. 
 * Whenever information in a buffer is accessed, this buffer is brought to the front of the list. 
 * When new information must be read, the buffer at the back of the list 
 * (the one least recently used) is taken and its "old" information is either discarded or written to disk, as appropriate. 
 * This is an easily implemented approximation to LFU and is often the method of choice for managing 
 * buffer pools unless special knowledge about information access patterns for an application suggests a special-purpose buffer management scheme.*/
public class BufferPool {
	MyBuffer buff;
	MyBuffer buff1;
	MyBuffer buff2;
	MyBuffer buff3;
	File files;
	static Filearray file;
	private boolean dirty;
	private static RandomAccessFile raf;
	List<MyBuffer> strings;
	ArrayList<MyBuffer> list;
	//File file;

	/*
	 * buffer pool constructor should send into a buffer
	 */
	// filearray sees if position is in current buffer
	// calculate offset?
	// if not, checks whats in the buffer to see if flags are turned on
	// if flags are on it writes back to file,clears the buffer, and adds new
	// one
	// then sends new buffer to quicksort?
	public BufferPool(File file) throws IOException {
		raf = new RandomAccessFile(file, "rw");
		buff = new MyBuffer(4096, 0);
		for (int i = 0; i <= 4095; i += 2) {
			raf.seek(i);
			// System.out.println(raf.readShort());
			buff.putShort(raf.readShort());
		}
		buff1 = new MyBuffer(4096, 4096);
		for (int i = 4096; i <= 8191; i += 2) {
			raf.seek(i);
			buff1.putShort(raf.readShort());
		}
		buff2 = new MyBuffer(4096, 8191);
		for (int i = 8192; i <= 12287; i += 2) {
			raf.seek(i);
			buff2.putShort(raf.readShort());
		}
		buff3 = new MyBuffer(4096, 12288);
		for (int i = 12288; i <= 16383; i += 2) {
			raf.seek(i);
			buff3.putShort(raf.readShort());
		}
		//this.files = new File(file);
		list = new ArrayList<MyBuffer>();
		list.add(buff);
		list.add(buff1);
		list.add(buff2);
		list.add(buff3);

	}

	public void read(int index, MyBuffer buffs) throws IOException {
		files = new File("testhw5.dat");
		raf = new RandomAccessFile(files, "rw");
		buff.setBegin(index);
		// int size =getSize(files);
		//buffs = new MyBuffer(4096, index);
		for (int i = index; i <= (index+4095); i += 2) {
			raf.seek(i);
			// System.out.println(raf.readShort());
			buffs.putShort(raf.readShort());
		}

		// Record rec = new Record(key, value);

	}

	public void print(File file) throws IOException {
		raf = new RandomAccessFile(file, "rw");
		for (int i = 0; i <= getSize(file); i += 2) {
			raf.seek(i);
			System.out.println(raf.readShort());

		}

	}
	public Record checkBuffers(int index) {
		short zero = -1;
		// System.out.println(buff.end);
		if ((buff.begin <= index) && (index <= buff.end)) {// sees if it is
															// range of buff
			System.out.println("f");
			int i = index - (buff.begin);
			short key = buff.getShort(i);
			short value = buff.getShort(i + 2);
			Record rec = new Record(key, value);

			list.remove(buff);
			list.add(0, buff);

			return rec;

		} else if ((buff1.begin <= index) && (index <= buff1.end)) {// sees if
																	// it is
																	// range of
																	// buff
			System.out.println("f");
			int i = index - (buff1.begin);
			short key = buff1.getShort(i);
			short value = buff1.getShort(i + 2);
			Record rec = new Record(key, value);
			list.remove(buff1);
			list.add(0, buff1);
			return rec;

		} else if ((buff2.begin <= index) && (index <= buff2.end)) {// sees if
																	// it is
																	// range of
																	// buff
			System.out.println("f");
			int i = index - (buff2.begin);
			short key = buff2.getShort(i);
			short value = buff2.getShort(i + 2);
			Record rec = new Record(key, value);
			list.remove(buff2);
			list.add(0, buff2);
			return rec;

		} else if ((buff3.begin <= index) && (index <= buff3.end)) {// sees if
																	// it is
																	// range of
																	// buff

			System.out.println("f");
			int i = index - (buff3.begin);
			short key = buff3.getShort(i);
			short value = buff3.getShort(i + 2);
			Record rec = new Record(key, value);
			list.remove(buff3);
			list.add(0, buff3);
			return rec;

		} else {
			System.out.println("f");
			Record rec = new Record(zero, zero);
			return rec;

		}

	}

	public void check(int index, Record rec) {
		short zero = -1;

		if ((buff.begin <= index) && (index <= buff.end)) {// sees if it is
															// range of buff
			buff.putShort((index - buff.begin), rec.getKey());
			buff.putShort((index - buff.begin) + 2, rec.getValue());
			list.remove(buff);
			list.add(0, buff);

		}
		if ((buff1.begin <= index) && (index <= buff1.end)) {// sees if it is
																// range of buff
			buff1.putShort((index - buff.begin), rec.getKey());
			buff1.putShort((index - buff.begin) + 2, rec.getValue());
			list.remove(buff1);
			list.add(0, buff1);
		} else if ((buff2.begin <= index) && (index <= buff2.end)) {// sees if
																	// it is
																	// range of
																	// buff
			buff2.putShort((index - buff.begin), rec.getKey());
			buff2.putShort((index - buff.begin) + 2, rec.getValue());
			list.remove(buff2);
			list.add(0, buff2);
		} else if ((buff3.begin <= index) && (index <= buff3.end)) {// sees if
																	// it is
																	// range of
																	// buff

			buff3.putShort((index - buff.begin), rec.getKey());
			buff3.putShort((index - buff.begin) + 2, rec.getValue());
			list.remove(buff3);
			list.add(0, buff3);
		}

	}

	public Record doLRU(int index) throws IOException {
		// dont use get access. use a system that ranks them in usage
		boolean dirty = checkDirty(list.get(3));
		// System.out.println(list.get(3));
		if (dirty == true) {
			write(list.get(3));
			list.get(3).clear();
		
			read(index - 4095, list.get(3));
			// Record rec=list.get(3).getShort(index);
			Record rec = checkBuffers(index);
			return rec;
		} else {

			list.get(3).clear();
			read(index - 4095, list.get(3));
			System.out.println(list.get(3).begin);
			// Record rec=list.get(3).getShort(index);
			Record rec = checkBuffers(index);
			return rec;
		}

	}

	public boolean checkDirty(MyBuffer buff) {// LRO happens here

		return buff.getDirty();
	}

	public static void write(MyBuffer buff) throws IOException {
		raf = new RandomAccessFile("testhw5.dat", "rw");
		int index = buff.begin;
		for (int i = buff.begin; i <= buff.end; i += 2) {
			raf.seek(index);
			raf.writeShort(buff.getShort(i));

			// short value=raf.putShort();
			// Record rec = new Record(key, value);
			// file.SetIndex(index, rec);
		}
	}

	public static int getSize(File file) throws IOException {
		// short zero=-1;
		raf = new RandomAccessFile(file, "rw");

		// this.size=(int) raf.length();
		return (int) raf.length();
	}

	/*
	 * buffer number of buffer sea java instant method is now
	 */

}



