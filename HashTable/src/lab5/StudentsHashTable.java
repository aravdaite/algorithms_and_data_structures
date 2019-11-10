/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StudentsHashTable<Key, Value> extends HashTable {

	private ArrayList<Student> students;
	private ArrayList<Integer> matNum;

	public StudentsHashTable() {
		super(1000);
		students = new ArrayList<>();
		matNum = new ArrayList<>();

	}

	public void add(Student student) {

		boolean isAdded = !isReapeted(student);
		if (isAdded) {
			students.add(student);
			matNum.add(student.getMatriculationNumber());
			put(student.getMatriculationNumber(), student);
		}
	}

	public Student getStudent(int MatriculationNumber) {
		int position = 0;

		for (Integer in : matNum) {
			if (MatriculationNumber == in) {
				return students.get(position);
			}
			position++;
		}
		return null;
	}

	public ArrayList<Student> studentsEntrySet() {
		return students;
	}

	public boolean isReapeted(Student student) {

		for (Student s : students) {
			if (student.equals(s)) {
				return true;
			}
		}
		return false;
	}
}
