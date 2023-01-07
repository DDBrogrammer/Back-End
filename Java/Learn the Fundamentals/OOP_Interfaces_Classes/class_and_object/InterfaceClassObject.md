# Class,Object and Interface

## `Object`
- `Object` là 1 thực thể có trạng thái (`state`) và hành vi (`behavior`). 
- `Object` là thể hiện của 1 `class`.
<p align = "center">
    <img width = 80% src="images/img.png">
</p>

- Một `object` sẽ có 3 đặc điểm:
  - `State`: đại diện cho dữ liệu hoặc giá trị của `object`.
  - `Behavior`: đại diện cho hành vi của `object`.
  - `Identity`: nhân dạng là 1 ID độc nhất mà chỉ `object` đó có. Gía trị của Id không thể được nhìn thấy bởi lập trình viên. `JVM` sẽ dùng ID của `object` để phân biệt với các `object` khác.
  
<p align = "center">
    <img width = 80% src="images/img_1.png">
</p>

## `Class`
- `Class` là 1 bản vẽ, bản thiết kế để tạo ra các object.
- Một `class` bao gồm: 
  - `Fields`
  - `Methods`
  - `Constructors`
  - `Blocks`
  - `Nested class and interface`
  
  <p align = "center">
    <img width = 80% src="images/img_2.png">
</p>

- Cấu trúc để khai báo 1 `class`.

```java
class <class_name>{  
    field;  
    method;  
}  
```

## `new` keyword 
- Keyword new sẽ báo với JVM phân bổ bộ nhớ ở Heap space và tạo ra 1 object mới qua constructor.

## `Constructor`
- `Constructor` là 1 code block sẽ chạy khi ta khởi tạo `object`.
- `Constructor` chạy trước khi `object` được tham chiếu.
- Tất cả các Class đều có 1 `Constructor defaule` ngay cả khi chúng ta không viết ra.

```java
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```

## Ways to initialize object
- Khi khởi tạo 1 object nghĩa là chúng ta tạo và lưu dữ liệu vào `object` đó.

### Initialization steps

- Báo với JVM tạo bộ nhớ ở `stack` để chứa  `reference variable` bao gồm tên của `variable` và `type`
  
  <p align = "center">
    <img width = 80% src="images/img_3.png">
 </p>

- Báo với JVM tạo bộ nhớ ở `heap space` để chứa object.

<p align = "center">
    <img width = 80% src="images/img_4.png">
 </p>

- Kết nối `object` với `reference variable`.

<p align = "center">
    <img width = 80% src="images/img_5.png">
 </p>


### Initialization through reference
- Khởi tạo qua `reference variable`.
- Sử dụng từ khóa `new` và gọi đến `constructor` của `object`.
```java
class Student{  
 int id;  
 String name;  
}  
class TestStudent2{  
 public static void main(String args[]){  
  Student s1=new Student();  
  s1.id=101;  
  s1.name="Sonoo";  
  System.out.println(s1.id+" "+s1.name);//printing members with a white space  
 }  
}
```

# `Interface`
- `Interface` là bản vẽ hành vi của 1 Class. `Interface` chỉ ra `methods` của `class` nhưng không chỉ ra những hành động cụ thể hoặc steps tạo nên `method` đó.
- Một `Interface` bao gồm các `static constants variable` và `abstract methods`.
- Để triển khai 1 `interface` ta dùng từ khóa `implements`.
```java
// Java program to demonstrate the
// real-world example of Interfaces

import java.io.*;

interface Vehicle {

  // all are the abstract methods.
  void changeGear(int a);
  void speedUp(int a);
  void applyBrakes(int a);
}

class Bicycle implements Vehicle{

  int speed;
  int gear;

  // to change gear
  @Override
  public void changeGear(int newGear){

    gear = newGear;
  }

  // to increase speed
  @Override
  public void speedUp(int increment){

    speed = speed + increment;
  }

  // to decrease speed
  @Override
  public void applyBrakes(int decrement){

    speed = speed - decrement;
  }

  public void printStates() {
    System.out.println("speed: " + speed
            + " gear: " + gear);
  }
}

class Bike implements Vehicle {

  int speed;
  int gear;

  // to change gear
  @Override
  public void changeGear(int newGear){

    gear = newGear;
  }

  // to increase speed
  @Override
  public void speedUp(int increment){

    speed = speed + increment;
  }

  // to decrease speed
  @Override
  public void applyBrakes(int decrement){

    speed = speed - decrement;
  }

  public void printStates() {
    System.out.println("speed: " + speed
            + " gear: " + gear);
  }

}
class GFG {

  public static void main (String[] args) {

    // creating an inatance of Bicycle
    // doing some operations
    Bicycle bicycle = new Bicycle();
    bicycle.changeGear(2);
    bicycle.speedUp(3);
    bicycle.applyBrakes(1);

    System.out.println("Bicycle present state :");
    bicycle.printStates();

    // creating instance of the bike.
    Bike bike = new Bike();
    bike.changeGear(1);
    bike.speedUp(4);
    bike.applyBrakes(3);

    System.out.println("Bike present state :");
    bike.printStates();
  }
}

```

