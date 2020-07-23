package day02;

import java.util.Date;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String str="abc.jpg";
		Date date = new Date();
		// 将时间从date类型, 转换成了long类型所表示的毫秒值
		long time = date.getTime();
		String regex="\\.";
		String[] a=str.split(regex);
		a[0]=a[0].replaceAll("[a-zA-Z]+", String.valueOf(time));
		System.out.println(a[0]+'.'+a[1]);
		
	}
}
