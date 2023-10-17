Objective: To demonstrate the concept of inheritance in Java

Pre-Lab Exercise:

Create an abstract class called Shape2d that has two data members of type
double and two abstract methods area() and display(). Create two derived
classes Rectangle and Triangle. In both classes define the method area() to
compute the area of that shape and return it as a double value and define the
method display() to display the value of the data members with appropriate
caption and the calculated area. Create a class called Shape2dDemo and
provide main method to instantiate the objects of Rectangle and Triangle for
demonstration of the above classes.

Lab Exercise:

Create a class called Account that has the protected data members accnumber
of int type, balance of double, and constructors for initialization.
Derive a class called SBAccount and define methods deposit(double),
withdraw(double), calc_interest(). Provide a parameterized constructor with
two parameters account number, and init_balance and assign these values to
the appropriate data members of the class using super class constructor. The
deposit method should take one double type argument amount and adds the
amount to the balance if the amount is positive. The withdraw method, should
take one double type argument amount and checks if balance - amount is
greater than Rs.1000/-. If so, it should subtract the amount from balance.
Otherwise it should display error message. The calc_interest() method should
compute interest for the balance amount available @ 4% for one year and the
interest amount should be credited to the balance.

Derive another class called FDAccount that has a data member period of int
type. Provide parameterized constructor with parameters for accno, period and
deposit amount for initializing them. Provide a method called calc_interest()
for calculating interest for the deposit amount for the given period @ 8.25%
p.a. and returns the calculated interest, and another method called close()
which calls calc_interest() add it to the balance.

Create a class called Customer. The data members of the class are cust_id of
int type, name, and address of string type, and objects of SBAccount, and
FDAccount. Provide parameterized constructor with cust_id, name and
address as parameters for initializing. Provide a method called
createAccount(int type). Based on the value of type (SB, or FD) create a new
account of given type. Provide a method transaction(int type) {type may be
withdraw, deposit or calc_interest on SBAccount, or closing of FDAccount}
to perform the requested transaction on the requested Account object.

To demonstrate all the functionalities of above classes, create a class called
BankDemo and declare a main method to create an array of 5 elements of
Customer objects, and perform manipulations on the objects by creating SB
and FD accounts, depositing and withdrawing amount from SB account, and
closing FD account.
