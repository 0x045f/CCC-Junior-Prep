# Welcome to Lesson # 4!
> Today we will be talking about how to use objects! Today's lesson will also be very short, as you have to learn the syntax of your    
> program online, either documentation or a tutorial, I'll only cover some basic stuffs here

> ## Python
>> ```python 
>> class Student:
>> ```
>> this is an object, you can have many other stuffs inside of this object, for example:
>> ``` python
>> class Student:
>>  name 
>>  grade 
>>  teacher
>> ```
>> we can also assign stuff to these variables 
>> ``` python
>> class Student:
>>  def __init__(self, name, grade, teacher):
>>    self.name = name
>>    self.grade = grade
>>    self.teacher = teacher
>> ```
>>### Example program
>> ```python
>> class Student
>>  def __init__(self, name, grade, teacher):
>>    self.name = name
>>    self.grade = grade
>>    self.teacher = teacher
>> s1 = Student('arihan', 7, 'idk')
>> print(s1.name)
>> print(s1.grade)
>> print(s1.teacher)
>> ```

> ## Java
>> ``` java
>> static class Student{}
>> ```
>> this is an object, you can have many other stuffs inside of this object, for example:
>> ``` java
>> static class Student{
>>  String name, teacher; int grade;
>> }
>> ```
>> we can assign stuff to these variables
>> ``` java
>> static class Student {
>>    String name, teacher; int grade;
>>    public Student(String name, int grade, String teacher){
>>      this.name = name;
>>      this.grade = grade;
>>      this.teacher = teacher;
>>    }
>> }
>> ```
>>### Example program
>> ``` java
>> static class Student {
>>    String name, teacher; int grade;
>>    public Student(String name, int grade, String teacher){
>>      this.name = name;
>>      this.grade = grade;
>>      this.teacher = teacher;
>>    }
>> }
>> public static void main(String[]args){
>>   Student s = new Student("arihan", 7, "idk");
>>   System.out.println(s.name);
>>   System.out.println(s.grade);
>>   System.out.println(s.teacher);
>> }
>> ```
> # C++
>> ``` cpp
>> struct Student {}
>> ```
>> this is an object, you can have many other stuffs inside of this object, for example:
>> ``` cpp
>> struct Student{
>>   String name, teacher; int grade;
>> }
>> ```
>> to assign stuff to these variables, you need to assign them in the main, or you can preset them in the struct, the implementation   
>> is left to the reader
>>### Example Program
>> ``` cpp
>> struct Student{
>>    String name, teacher; int grade;
>> }
>> int main(){
>>    Student s;
>>    s.name = "arihan";
>>    s.teacher = "idk";
>>    s.grade = 7;
>>    cout<<s.name<<s.grade<<s.teacher<<endl;
>>    return 0;
>> }
>> ```
> That's pretty much it, you can put methods in there, whatever you want, the rest of it is for you to learn by yourself, or you can   
> look up tutortials online that go deeper into objects and classes    
> I'll explain more along the way, in other lessons
