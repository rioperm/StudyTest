package part2.StringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	int add(String text){
		//����� ��
		if(isBlank(text)){
			return 0;
		}
		//���ڿ� �� , �� ������ �� 
		return sum(toInts(split(text)));
	}
	
	private boolean isBlank(String text){
		return text==null || text.isEmpty();
	}
	
	private String[] split(String text){
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if(m.find()){
			String customDelimeter = m.group(1);
			return m.group(2).split(customDelimeter);
		}
		return text.split(",|:");
	}
	
	private int[] toInts(String[] values){
		int[] numbers = new int[values.length];
		for (int i=0; i<values.length; i++){
			numbers[i] = toPositive(values[i]);
		}
		return numbers;
	}
	
	int sum(int[] values){
		int sum=0;
		for(int num:values){
			sum+=num;
		}
		return sum;
	}
	
	private int toPositive(String value){
		int number = Integer.parseInt(value);
		if(number<0){
			System.out.println(number);
			throw new RuntimeException();			
		}
		return number;
	}
	
}
