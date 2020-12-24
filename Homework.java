
package homework;

public class Homework {

	public static void main(String[] args) {
		System.out.println("************��һ��***********");
		Person a = new Person("����", 18, '��');
		a.show();

		System.out.println();
		System.out.println("************�ڶ���***********");
		Dog dogA = new Dog("��������", "��ɫ", "32.5");
		dogA.show();
		Dog dogB = new Dog("����", "��ɫ", "23.5");
		dogB.show();
		
		System.out.println();
		System.out.println("************������***********");
		Pig pig = new Pig("��ɫ", 5, 50, 0.8);
		pig.show();

		System.out.println();
		System.out.println("************������***********");
		Card card = new Card("÷��", "5");
		card.show();

		System.out.println();
		System.out.println("************������***********");
		Date date = new Date(2008, 10, 1);
		date.show();

		System.out.println();
		System.out.println("************������***********");
		Product pro = new Product("1", "��Ϊ�ֻ�", "�����", 6999);
		pro.show();

		System.out.println();
		System.out.println("************������***********");
		Teacher tr = new Teacher("������", "������", "88888");
		Student st = new Student("����", "666", "L20201001J");
		tr.show();
		st.show();

		System.out.println();
		System.out.println("************�ڰ���***********");
		BigPig bp = new BigPig("���绨��", "��ɫ", 50);
		bp.walk();
		bp.attackMan();
		bp.eat();
		String info = bp.getInfo();
		System.out.println("��ϢΪ��" + info);
		String type = bp.getType();
		System.out.println("����Ϊ��" + type);
		String color = bp.getColor();
		System.out.println("��ɫΪ��" + color);

		System.out.println();
		System.out.println("************�ھ���***********");
		SecondDate sd = new SecondDate(2020, 12, 23);
		String Sdate = sd.getDate();
		System.out.println(Sdate);
		int day = sd.getDay();
		System.out.println(Sdate + "�������" + day + "��");

		System.out.println();
		System.out.println("************��ʮ��***********");
		Car car = new Car("������", 999999, "��ɫ");
		car.start();
		car.accelerate();
		car.sold();
		car.show();

		System.out.println();
		System.out.println("************��ʮһ��***********");
		BigDog bg = new BigDog("����", '��', "�л���԰Ȯ");
		bg.run();
		bg.grow();
		String bgName = bg.getName();
		System.out.println("����Ϊ��" + bgName);
		char bgSex = bg.getSex();
		System.out.println("�Ա�Ϊ��" + bgSex);
		String bgType = bg.getType();
		System.out.println("����Ϊ��" + bgType);
		String bgInfo = bg.toString();
		System.out.println("������ϢΪ��" + bgInfo);

		System.out.println();
		System.out.println("************��ʮ����***********");
		StudentGrade sg = new StudentGrade("������", 98, 88, 78);
		sg.study();
		System.out.println("����Ϊ��" + sg.getName());
		System.out.println("Java����Ϊ��" + sg.getJavaGrade());
		System.out.println("�ܳɼ�Ϊ��" + sg.getSumGrade());
		System.out.println("ƽ����Ϊ��" + sg.average());

		System.out.println();
		System.out.println("************��ʮ����***********");
		Computer computer = new Computer();
		System.out.println("18��ż����" + computer.is18Even());
		System.out.println("�����������2006�ǲ�������" + computer.isLeapYear(2006));
		System.out.println("�����������������֮��" + computer.getSum(5, 6));
		System.out.println("�����������������֮��" + computer.getSum(7, 8));
		System.out.println("������������������ĸ���" + computer.max(8, 6));
		System.out.println("������ɵ�����Ϊ");
		int[] arr = computer.getArray();
		for (int i = 0; i < 10; i++) {
			System.out.print("arr[" + i + "]=" + arr[i] + "��");
		}
		
		Object obj = new Object();
		obj.toString();
	}

	/**
	 * @ClassName: Person
	 * @Description: дһ���˵��࣬���������ԣ����������䡢�Ա���һ��չʾ������Ϣ�ķ���(show)��
	 *               дһ�������࣬����һ������ı���a������һ���˵Ķ�����뵽a������ȥ�������˵�������ֵΪ�����ӡ�������Ϊ18���Ա�Ϊ'��'��
	 *               ��ʾa����Ϣ(����show����)��
	 * @author LYL
	 * @date 2020-12-23 04:29:37
	 */
	static class Person {
		String name;
		int age;
		char sex;

		Person(String name, int age, char sex) {
			this.name = name;
			this.age = age;
			this.sex = sex;
		}

		public void show() {
			System.out.println("����Ϊ��" + name + "������Ϊ��" + age + "���Ա�Ϊ��" + sex);
		}
	}

	/**
	 * 
	 * @ClassName: Dog
	 * @Description: дһ�������࣬���������ԣ���������ɫ�����ء���һ��չʾ����Ϣ�ķ�������дһ�������࣬
	 *               ���ȶ���һֻ����ı���a,����һֻ���Ķ�����뵽a������ȥ�����˹���������ֵΪ���������ӡ�����ɫΪ����ɫ��������Ϊ32.5���
	 *               ��ʾa������Ϣ��Ȼ������������һֻ���Ķ�����뵽b������ȥ�����˹���������ֵΪ�����ܡ�����ɫΪ����ɫ��������Ϊ23.5����
	 *               ������ʾb������Ϣ��
	 * @author LYL
	 * @date 2020-12-23 04:37:42
	 */
	static class Dog {
		String name;
		String color;
		String weight;

		Dog(String name, String color, String weight) {
			this.name = name;
			this.color = color;
			this.weight = weight;
		}

		public void show() {
			System.out.println("����Ϊ��" + name + "����ɫΪ��" + color + "������Ϊ��" + weight + "����");
		}

		
		@Override
		public String toString() {
			return "Dog [name=" + name + ", color=" + color + ", weight=" + weight + "]";
		}
		

	}

	/**
	 * 
	 * @ClassName: Pig
	 * @Description: дһ��������Ϸ�е����࣬���������ԣ���ɫ����ͷ����������׼ȷ�ȡ�
	 *               ��һ��չʾ����Ϣ�ķ�������дһ�������࣬����һ����Ķ��󣬽��������ɫֵΪ����ɫ����
	 *               ��ͷΪ5���ף�������Ϊ50��Ѫ��׼ȷ��Ϊ0.8��Ҫ������������Ϣ��ʽΪ��һֻ��ɫ����
	 *               ��ͷ5���ף�����ΪΪ50��Ѫ��׼ȷ��Ϊ0.8���Һ�����ѽ
	 * @author LYL
	 * @date 2020-12-23 04:47:56
	 */
	static class Pig {
		String color;
		int size;
		int attack;
		double accuracy;

		public Pig(String color, int size, int attack, double accuracy) {
			this.color = color;
			this.size = size;
			this.attack = attack;
			this.accuracy = accuracy;
		}

		public void show() {
			System.out.println("һֻ" + color + "������ͷΪ" + size + "���ף�������Ϊ" + attack + "��Ѫ��׼ȷ��Ϊ" + accuracy + "�Һ�����ѽ��");
		}

	}

	/**
	 * 
	 * @ClassName: Card
	 * @Description: дһ���Ƶ��࣬���������ԣ���ɫ��ֵ����һ��չʾ������Ϣ�ķ�����Ҫ��дһ�������࣬
	 *               ����һ���ƣ������ƵĻ�ɫ��Ϊ��÷�����������Ƶ�ֵ��Ϊ5�������ʾ���Ƶ���Ϣ�� Ҫ���ʽΪ:÷��5
	 * @author LYL
	 * @date 2020-12-23 05:01:36
	 */
	static class Card {
		String color;
		String value;

		Card(String color, String value) {
			this.color = color;
			this.value = value;
		}

		public void show() {
			System.out.println(color + value);
		}
	}

	/**
	 * 
	 * @ClassName: Date
	 * @Description:дһ�����ڵ��࣬���������ԣ��ꡢ�¡��ա���һ��չʾ����Ϣ�ķ�����Ҫ��дһ�������� ������һ�����ڶ������ô����ڶ������Ϊ2008�����ô����ڵ���Ϊ10��
	 *                                                       ���ô����ڶ������Ϊ1�������ʾ�����ڣ�Ҫ���ʽΪ��2008��10��01��
	 * @author LYL
	 * @date 2020-12-23 05:05:36
	 */
	static class Date {
		int year;
		int month;
		int day;

		Date(int year, int month, int day) {
			this.year = year;
			this.month = month;
			this.day = day;
		}

		public void show() {
			System.out.println(year + "��" + month + "��" + day + "��");
		}
	}

	/**
	 * 
	 * @ClassName: Product
	 * @Description: �������ڿ���һ�������̳���Ŀ��������Լ�����������Ʒ�ࣨ��Ƹ������ԣ�
	 *               �Լ�һ��չʾ��Ϣ��show���������ڲ������д���������ʾ��Ϣ
	 * @author LYL
	 * @date 2020-12-23 05:11:41
	 */
	static class Product {
		String id;
		String name;
		String description;
		int price;

		public Product(String id, String name, String description, int price) {
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
		}

		public void show() {
			System.out.println("��Ʒ���Ϊ" + id + "������Ϊ" + name + "������Ϊ" + description + "�۸�Ϊ" + price + "Ԫ");
		}

	}

	/**
	 * 
	 * @ClassName: Teacher
	 * @Description: �������ڿ���һ��У԰����ϵͳ��������Լ���������ѧ�������Ա�ࣨ�������������
	 *               �Ĳ�ͬ���ԣ��Լ�չʾ��Ϣ��show���������ڲ������д���������ʾ��Ϣ��
	 * @author LYL
	 * @date 2020-12-23 05:17:03
	 */
	static class Teacher {
		String job;
		String name;
		String salary;

		public Teacher(String job, String name, String salary) {
			super();
			this.job = job;
			this.name = name;
			this.salary = salary;
		}

		public void show() {
			System.out.println("����" + name + "��ְλΪ��" + job + "��н��Ϊ��" + salary);
		}
	}

	/**
	 * 
	 * @ClassName: Student
	 * @Description: �������ڿ���һ��У԰����ϵͳ��������Լ���������ѧ�������Ա�ࣨ�������������
	 *               �Ĳ�ͬ���ԣ��Լ�չʾ��Ϣ��show���������ڲ������д���������ʾ��Ϣ��
	 * @author LYL
	 * @date 2020-12-23 05:17:11
	 */
	static class Student {
		String name;
		String id;
		String lesson;

		public Student(String name, String id, String lesson) {
			super();
			this.name = name;
			this.id = id;
			this.lesson = lesson;
		}

		public void show() {
			System.out.println("����" + name + "��ѧ��Ϊ��" + id + "������" + lesson + "���");
		}
	}

	/**
	 * 
	 * @ClassName: BigPig
	 * @Description: дһ�����࣬���е����ԣ�Ʒ�֣���ɫ���������������з����� �޷���ֵ�ķ�����
	 *               ��һ������·�ķ�����û�з���ֵ��Ҫ�������ʽΪ��ĳĳƷ�ֵ�ĳĳ��ɫ����������ȥ����
	 *               ����������˵ķ�����û�з���ֵ��Ҫ�������ʽΪ��ĳĳƷ�ֵ�ĳĳ��ɫ��������ˣ������� Ϊ���١���
	 *               (������Է��ķ�����û�з���ֵ��Ҫ�������ʽΪ��ĳĳƷ�ֵ�ĳĳ��ɫ����Ե���ࡱ�� �з���ֵ�ķ�����
	 *               ��һ���õ�����������Ϣ�ķ�����toString)���������õ�����Ʒ�ֵķ�����Ҫ���ڴ˷�����û��
	 *               ������������Ʒ�֡��������õ�������ɫ�ķ�����Ҫ���ڴ˷�����û����������ش������ɫ�� ��д������ ����������
	 *               ���ö����еķ�������ʾ�����
	 * @author LYL
	 * @date 2020-12-23 05:25:33
	 */
	static class BigPig {
		String type;
		String color;
		int attack;

		public BigPig(String type, String color, int attack) {
			super();
			this.type = type;
			this.color = color;
			this.attack = attack;
		}

		public void walk() {
			System.out.println(type + "Ʒ�ֵ�" + color + "��ɫ����������ȥ");
		}

		public void attackMan() {
			System.out.println(type + "Ʒ�ֵ�" + color + "��ɫ��������ˣ�������Ϊ" + attack);
		}

		public void eat() {
			System.out.println(type + "Ʒ�ֵ�" + color + "��ɫ����Ե����");
		}

		public String getInfo() {
			return "����Ϊ" + type + ",��ɫΪ" + color + "������Ϊ" + attack;
		}

		public String getType() {
			return type;
		}

		public String getColor() {
			return color;
		}
	}

	/**
	 * 
	 * @ClassName: SecondDate
	 * @Description: дһ�����ڵ��࣬���������ԣ��꣬�£��ա������з�����
	 *               ��һ����õ�ǰ���ڶ���������Ϣ�ķ���toString��Ҫ������Ϊ��XXXX��XX��XX�ա��� ��������������������ķ���
	 *               ����������»������µ������� ��д�����࣬�������󣬵��ö����еķ�������ʾ�����
	 * @author LYL
	 * @date 2020-12-23 05:38:51
	 */
	static class SecondDate {
		int year;
		int month;
		int day;

		public SecondDate(int year, int month, int day) {
			super();
			this.year = year;
			this.month = month;
			this.day = day;
		}

		public String getDate() {
			return year + "��" + month + "��" + day + "��";
		}

		public int getDay() {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				if (month == 2) {
					return 29;
				} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
						|| month == 12) {
					return 31;
				} else {
					return 30;
				}
			} else {
				if (month == 2) {
					return 29;
				} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
						|| month == 12) {
					return 31;
				} else {
					return 30;
				}
			}
		}
	}

	/**
	 * 
	 * @ClassName: Car
	 * @Description: дһ���������࣬���������ԣ�Ʒ�ƣ��۸���ɫ�������з�����
	 *               ��һ�����������ķ�����Ҫ�������XXƷ�Ƶ����������ˡ����������������ٵķ�����Ҫ�����
	 *               ��XXƷ�Ƶ����������С������������������ķ�����Ҫ�������XXƷ�Ƶ���������XXԪ�ļ۸��� �ˡ���
	 *               ���ģ���ʾ��ǰ����������������Եķ���toString�� ��д������ ���������� ���ö����еķ���
	 * @author LYL
	 * @date 2020-12-23 05:51:24
	 */
	static class Car {
		String brand;
		int price;
		String color;

		public Car(String brand, int price, String color) {
			super();
			this.brand = brand;
			this.price = price;
			this.color = color;
		}

		public void start() {
			System.out.println(brand + "Ʒ�Ƶ�����������");
		}

		public void accelerate() {
			System.out.println(brand + "Ʒ�Ƶ�����������");
		}

		public void sold() {
			System.out.println(brand + "Ʒ�Ƶ���������" + price + "Ԫ�ļ۸�������");
		}

		public void show() {
			System.out.println("Ʒ��Ϊ" + brand + "���۸�Ϊ" + price + "����ɫΪ" + color);
		}
	}

	/**
	 * 
	 * @ClassName: BigDog
	 * @Description: дһ�������࣬���������ԣ��������Ա�Ʒ�֡� �����з����� ��һ���޷��أ��޲����ķ�����
	 *               ���ܲ��ķ�����Ҫ�������ĳĳƷ�ֵĹ��ܵúÿ족�� ������ķ�����Ҫ�������ĳĳ�����Ĺ������ˡ���
	 * 
	 * 
	 *               �������з��أ��޲����ķ����� �õ���������������Ҫ�󷵻ص�ǰ���������� �õ������Ա�ķ�����Ҫ�󷵻ص�ǰ�����Ա�
	 *               �õ�����Ʒ�ֵķ�����Ҫ�󷵻ص�ǰ����Ʒ�֡� ���ص�ǰ������Ϣ�ķ�������toString()������
	 * 
	 *               toString() :����������ƴ�ӳ�һ���ִ� ���س���
	 * 
	 *               ��д������ ������������� ����ÿ������ 1.�����ܲ������󷽷��� 2.�ֱ��岻ͬ�������� �з��صķ���
	 *               ����ʾ��Щ������ֵ��
	 * @author LYL
	 * @date 2020-12-23 06:00:11
	 */
	static class BigDog {

		String name;
		char sex;
		String type;

		public BigDog(String name, char sex, String type) {
			super();
			this.name = name;
			this.sex = sex;
			this.type = type;
		}

		public void run() {
			System.out.println(type + "Ʒ�ֵĹ��ܵúÿ�");
		}

		public void grow() {
			System.out.println(name + "�����Ĺ�������");
		}

		public String getName() {
			return name;
		}

		public String getType() {
			return type;
		}

		public char getSex() {
			return sex;
		}

		public String toString() {
			return name + sex + type;
		}

	}

	/**
	 * 
	 * @ClassName: StudentGrade
	 * @Description: дһ��ѧ�����࣬���е�����ѧ�������֣�ѧ����java�ɼ���ѧ����sql�ɼ���ѧ����C#�ɼ��� �����з�����
	 *               ��һ��ѧ��ѧϰ�ķ������޷��أ�Ҫ�������ѧ����ѧϰ���� ����������ѧ�������ķ����� ����������ѧ��java�ɼ��ķ�����
	 *               ���ģ�����ѧ�����й����ܳɼ��ķ����� ���壩����ѧ�����й���ƽ���ֵķ����� ��д������ ����������
	 *               ���ö����еķ�������ʾ�����
	 * @author LYL
	 * @date 2020-12-23 06:12:24
	 */
	static class StudentGrade {
		String name;
		int JavaGrade;
		int SqlGrade;
		int CGrade;

		public StudentGrade(String name, int javaGrade, int sqlGrade, int cGrade) {
			super();
			this.name = name;
			JavaGrade = javaGrade;
			SqlGrade = sqlGrade;
			CGrade = cGrade;
		}

		public void study() {
			System.out.println("ѧ����ѧϰ");
		}

		public String getName() {
			return name;
		}

		public int getJavaGrade() {
			return JavaGrade;
		}

		public int getSumGrade() {
			return SqlGrade + JavaGrade + CGrade;
		}

		public double average() {
			return getSumGrade() / 3;
		}

	}

	/**
	 * 
	 * @ClassName: Computer
	 * @Description: (��չ��)дһ�����Ե��࣬���������ԡ� �����з����� ��һ���з��أ��޲����ķ�����
	 *               ��1�����ж�18������Ƿ�Ϊż���ķ���������������ż���ͷ��ء�true�������򷵻� ��false����
	 *               ��2�����ж�2006���Ƿ�������ķ�����Ҫ������һ���������ж���������Ƿ��ܱ�4�������Ҳ��ܱ�100�����������ܱ�400��������������������ء�true�������򷵻ء�false����
	 *               ��3�����ӷ���Ҫ�����5��6��ֵ�����������������ĺ͡� ��4�����˷���Ҫ�����7��8��ֵ�����������������ĳ˻���
	 *               ��5������8��6���ֵ�ķ����������Ǹ��ϴ��
	 *               ��6�����õ�һ����������ķ�����Ҫ�󷵻�һ���������飬����ĳ���Ϊ10������10�������������������
	 * @author LYL
	 * @date 2020-12-23 06:24:59
	 */
	static class Computer {
		public boolean is18Even() {
			if (18 % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}

		public boolean isLeapYear(int year) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				return true;
			} else {
				return false;
			}
		}

		public int getSum(int a, int b) {
			return a + b;
		}

		public int getMultiply(int a, int b) {
			return a * b;
		}

		public int max(int a, int b) {
			if (a >= b) {
				return a;
			} else {
				return b;
			}
		}

		public int[] getArray() {
			int[] arr = new int[10];
			for (int i = 0; i < 10; i++) {
				arr[i] = (int) (Math.random() * 100) + 1;
			}
			return arr;
		}

	}
}
