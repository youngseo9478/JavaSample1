package day16.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		// �̷��� ��ȣ�ȿ� ���ָ� **�ڵ� �ڿ� ��ȯ**�� �����ϱ⶧���� finally���� �ڿ��ݳ��� �ʿ� X
		try (FileInputStream fis = new FileInputStream("sample3.txt");) {
			System.out.println("�۾� ó��");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample2.txt������ �غ��ϼ���");
		} catch (Exception e) {
			// ��� �ٸ� ���ܸ� ���⼭ ����ִ� ��
		} finally {
			System.out.println("finally() ����");
		}

		System.out.println("__________________________________");
		try (Scanner sc = new Scanner(new File("sample2.txt"));) {

		} catch (FileNotFoundException e) {
			System.out.println("sample2.txt ������ �غ����ּ���...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		System.out.println("MAIN END");

	}
}
