
package homework;

public class Homework {

	public static void main(String[] args) {
		System.out.println("************第一题***********");
		Person a = new Person("麻子", 18, '男');
		a.show();

		System.out.println();
		System.out.println("************第二题***********");
		Dog dogA = new Dog("花花公子", "黄色", "32.5");
		dogA.show();
		Dog dogB = new Dog("黑熊", "黑色", "23.5");
		dogB.show();
		
		System.out.println();
		System.out.println("************第三题***********");
		Pig pig = new Pig("白色", 5, 50, 0.8);
		pig.show();

		System.out.println();
		System.out.println("************第四题***********");
		Card card = new Card("梅花", "5");
		card.show();

		System.out.println();
		System.out.println("************第五题***********");
		Date date = new Date(2008, 10, 1);
		date.show();

		System.out.println();
		System.out.println("************第六题***********");
		Product pro = new Product("1", "华为手机", "真好用", 6999);
		pro.show();

		System.out.println();
		System.out.println("************第七题***********");
		Teacher tr = new Teacher("班主任", "雷杨龙", "88888");
		Student st = new Student("雷琳", "666", "L20201001J");
		tr.show();
		st.show();

		System.out.println();
		System.out.println("************第八题***********");
		BigPig bp = new BigPig("宁乡花猪", "黑色", 50);
		bp.walk();
		bp.attackMan();
		bp.eat();
		String info = bp.getInfo();
		System.out.println("信息为：" + info);
		String type = bp.getType();
		System.out.println("种类为：" + type);
		String color = bp.getColor();
		System.out.println("颜色为：" + color);

		System.out.println();
		System.out.println("************第九题***********");
		SecondDate sd = new SecondDate(2020, 12, 23);
		String Sdate = sd.getDate();
		System.out.println(Sdate);
		int day = sd.getDay();
		System.out.println(Sdate + "这个月有" + day + "天");

		System.out.println();
		System.out.println("************第十题***********");
		Car car = new Car("法拉利", 999999, "黑色");
		car.start();
		car.accelerate();
		car.sold();
		car.show();

		System.out.println();
		System.out.println("************第十一题***********");
		BigDog bg = new BigDog("雷琳", '男', "中华田园犬");
		bg.run();
		bg.grow();
		String bgName = bg.getName();
		System.out.println("名字为：" + bgName);
		char bgSex = bg.getSex();
		System.out.println("性别为：" + bgSex);
		String bgType = bg.getType();
		System.out.println("种类为：" + bgType);
		String bgInfo = bg.toString();
		System.out.println("所有信息为：" + bgInfo);

		System.out.println();
		System.out.println("************第十二题***********");
		StudentGrade sg = new StudentGrade("雷杨龙", 98, 88, 78);
		sg.study();
		System.out.println("名字为：" + sg.getName());
		System.out.println("Java分数为：" + sg.getJavaGrade());
		System.out.println("总成绩为：" + sg.getSumGrade());
		System.out.println("平均分为：" + sg.average());

		System.out.println();
		System.out.println("************第十三题***********");
		Computer computer = new Computer();
		System.out.println("18是偶数吗" + computer.is18Even());
		System.out.println("看看你输入的2006是不是闰年" + computer.isLeapYear(2006));
		System.out.println("看看你输入的两个数之和" + computer.getSum(5, 6));
		System.out.println("看看你输入的两个数之积" + computer.getSum(7, 8));
		System.out.println("看看你输入的两个数哪个大" + computer.max(8, 6));
		System.out.println("随机生成的数组为");
		int[] arr = computer.getArray();
		for (int i = 0; i < 10; i++) {
			System.out.print("arr[" + i + "]=" + arr[i] + "，");
		}
		
		Object obj = new Object();
		obj.toString();
	}

	/**
	 * @ClassName: Person
	 * @Description: 写一个人的类，类中有属性：姓名、年龄、性别。有一个展示自我信息的方法(show)。
	 *               写一个测试类，定义一个人类的变量a，生成一个人的对象放入到a变量中去，将此人的姓名符值为“麻子”，年龄为18，性别为'男'。
	 *               显示a的信息(调用show方法)。
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
			System.out.println("姓名为：" + name + "，年龄为：" + age + "，性别为：" + sex);
		}
	}

	/**
	 * 
	 * @ClassName: Dog
	 * @Description: 写一个狗的类，类中有属性：姓名、颜色、体重。有一个展示狗信息的方法。再写一个测试类，
	 *               首先定义一只狗类的变量a,生成一只狗的对象放入到a变量中去，将此狗的姓名符值为“花花公子”，颜色为“黄色”，体重为32.5公斤，
	 *               显示a狗的信息。然后再重新生成一只狗的对象放入到b变量中去，将此狗的姓名符值为“黑熊”，颜色为“黑色”，体重为23.5公斤
	 *               ，再显示b狗的信息。
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
			System.out.println("名字为：" + name + "，颜色为：" + color + "，体重为：" + weight + "公斤");
		}

		
		@Override
		public String toString() {
			return "Dog [name=" + name + ", color=" + color + ", weight=" + weight + "]";
		}
		

	}

	/**
	 * 
	 * @ClassName: Pig
	 * @Description: 写一个传奇游戏中的猪类，类中有属性：颜色、个头、攻击力、准确度。
	 *               有一个展示猪信息的方法。再写一个测试类，生成一个猪的对象，将此猪的颜色值为“白色”，
	 *               个头为5厘米，攻击力为50点血，准确度为0.8。要求输出此猪的信息格式为：一只白色的猪，
	 *               个头5厘米，攻击为为50点血，准确度为0.8，我好怕怕呀
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
			System.out.println("一只" + color + "的猪，个头为" + size + "厘米，攻击力为" + attack + "点血，准确度为" + accuracy + "我好怕怕呀！");
		}

	}

	/**
	 * 
	 * @ClassName: Card
	 * @Description: 写一个牌的类，类中有属性：花色、值。有一个展示此牌信息的方法。要求写一个测试类，
	 *               生成一张牌，将此牌的花色设为“梅花”，将此牌的值设为5。最后显示此牌的信息， 要求格式为:梅花5
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
	 * @Description:写一个日期的类，类中有属性：年、月、日。有一个展示此信息的方法。要求写一个测试类 ，生成一个日期对象，设置此日期对象的年为2008，设置此日期的月为10，
	 *                                                       设置此日期对象的日为1，最后显示此日期，要求格式为：2008年10月01日
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
			System.out.println(year + "年" + month + "月" + day + "日");
		}
	}

	/**
	 * 
	 * @ClassName: Product
	 * @Description: 假设正在开发一个网上商城项目，请根据自己的理解设计商品类（设计各种属性，
	 *               以及一个展示信息的show方法）。在测试类中创建对象，显示信息
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
			System.out.println("商品编号为" + id + "，名称为" + name + "，描述为" + description + "价格为" + price + "元");
		}

	}

	/**
	 * 
	 * @ClassName: Teacher
	 * @Description: 假设正在开发一个校园管理系统，请根据自己的理解设计学生类与教员类（需体现两类对象
	 *               的不同属性，以及展示信息的show方法）。在测试类中创建对象，显示信息。
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
			System.out.println("我是" + name + "，职位为：" + job + "，薪资为：" + salary);
		}
	}

	/**
	 * 
	 * @ClassName: Student
	 * @Description: 假设正在开发一个校园管理系统，请根据自己的理解设计学生类与教员类（需体现两类对象
	 *               的不同属性，以及展示信息的show方法）。在测试类中创建对象，显示信息。
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
			System.out.println("我是" + name + "，学号为：" + id + "，我是" + lesson + "班的");
		}
	}

	/**
	 * 
	 * @ClassName: BigPig
	 * @Description: 写一个猪类，类中的属性：品种，颜色，攻击力。类中有方法： 无返回值的方法：
	 *               （一）猪走路的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪走来走去”。
	 *               （二）猪打人的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪打人了，攻击力 为多少”。
	 *               (三）猪吃饭的方法，没有返回值，要求输出格式为“某某品种的某某颜色的猪吃得真多”。 有返回值的方法：
	 *               （一）得到自身所有信息的方法（toString)。（二）得到此猪品种的方法，要求在此方法中没有
	 *               输出，返回猪的品种。（三）得到此猪颜色的方法，要求在此方法中没有输出，返回此猪的颜色。 编写测试类 。创建对象
	 *               调用对象中的方法，显示出结果
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
			System.out.println(type + "品种的" + color + "颜色的猪走来走去");
		}

		public void attackMan() {
			System.out.println(type + "品种的" + color + "颜色的猪打人了，攻击力为" + attack);
		}

		public void eat() {
			System.out.println(type + "品种的" + color + "颜色的猪吃得真多");
		}

		public String getInfo() {
			return "种类为" + type + ",颜色为" + color + "攻击力为" + attack;
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
	 * @Description: 写一个日期的类，类中有属性：年，月，日。类中有方法：
	 *               （一）获得当前日期对象所有信息的方法toString。要求内容为“XXXX年XX月XX日”。 （二）返回这个月天数的方法
	 *               （依据年和月获得这个月的天数） 编写测试类，创建对象，调用对象中的方法，显示出结果
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
			return year + "年" + month + "月" + day + "日";
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
	 * @Description: 写一个汽车的类，类中有属性：品牌，价格，颜色。类中有方法：
	 *               （一）汽车启动的方法，要求输出“XX品牌的汽车启动了”。（二）汽车加速的方法，要求输出
	 *               “XX品牌的汽车加速中”。（三）汽车被卖的方法，要求输出“XX品牌的汽车被以XX元的价格卖 了”。
	 *               （四）显示当前汽车对象的所有属性的方法toString。 编写测试类 。创建对象 调用对象中的方法
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
			System.out.println(brand + "品牌的汽车启动了");
		}

		public void accelerate() {
			System.out.println(brand + "品牌的汽车加速中");
		}

		public void sold() {
			System.out.println(brand + "品牌的汽车被以" + price + "元的价格卖出了");
		}

		public void show() {
			System.out.println("品牌为" + brand + "，价格为" + price + "，颜色为" + color);
		}
	}

	/**
	 * 
	 * @ClassName: BigDog
	 * @Description: 写一个狗的类，类中有属性：姓名，性别，品种。 类中有方法： （一）无返回，无参数的方法：
	 *               狗跑步的方法，要求输出“某某品种的狗跑得好快”。 狗长大的方法，要求输出“某某姓名的狗长大了”。
	 * 
	 * 
	 *               （二）有返回，无参数的方法： 得到狗的姓名方法，要求返回当前狗的姓名。 得到狗的性别的方法，要求返回当前狗的性别。
	 *               得到狗的品种的方法，要求返回当前狗的品种。 返回当前对象信息的方法，即toString()方法。
	 * 
	 *               toString() :将所有属性拼接成一个字串 返回出来
	 * 
	 *               编写测试类 ：创建该类对象 调用每个方法 1.调用跑步，长大方法； 2.分别定义不同变量接收 有返回的方法
	 *               并显示这些变量的值。
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
			System.out.println(type + "品种的狗跑得好快");
		}

		public void grow() {
			System.out.println(name + "姓名的狗长大了");
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
	 * @Description: 写一个学生的类，类中的属性学生的名字，学生的java成绩，学生的sql成绩，学生的C#成绩。 类中有方法：
	 *               （一）学生学习的方法，无返回，要求输出“学生在学习”。 （二）返回学生姓名的方法。 （三）返回学生java成绩的方法。
	 *               （四）返回学生所有功课总成绩的方法。 （五）返回学生所有功课平均分的方法。 编写测试类 。创建对象
	 *               调用对象中的方法，显示出结果
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
			System.out.println("学生在学习");
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
	 * @Description: (扩展题)写一个电脑的类，类中无属性。 类中有方法： （一）有返回，无参数的方法：
	 *               （1）、判断18这个数是否为偶数的方法，如果这个数是偶数就返回“true”，否则返回 “false”。
	 *               （2）、判断2006年是否是润年的方法，要求函数内一个整数，判断这个整数是否能被4整除并且不能被100整除，或者能被400整除，如果满足条件返回“true”，否则返回“false”。
	 *               （3）、加法，要求计算5和6的值，返回这两个整数的和。 （4）、乘法，要求计算7和8的值，返回这两个整数的乘机。
	 *               （5）、找8和6最大值的方法，返回那个较大的
	 *               （6）、得到一个整形数组的方法，要求返回一个整形数组，数组的长度为10，放入10个任意的数到数组里面
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
