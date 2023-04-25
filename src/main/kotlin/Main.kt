fun main() {
     //1
    
    //2
    account("armandrrrA12")
    //3
    ages()

}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
data class Grammar(var first:Char,var last:Char,var length:Int,var vowel:Boolean)
fun words(word:String):Grammar{
    var first=word.get(0)
    var last=word.get(-1)
    var length=word.length
        if (word.get(0)=='a'&&word.get(0)=='e'&&word.get(0)=='i'&&word.get(0)=='o'&&word.get(0)=='u'&&word.get(0)=='A'&&word.get(0)=='E'&&word.get(0)=='I'&&word.get(0)=='O'&&word.get(0)=='U'){
           return  true
        }
        else{
            return false
        }
    }
}
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
 fun account(password:String):Boolean{

     if(password.length>=8 && password.length<=16 && password.contains("password")==false ){
         return true
     }
    else{
        return false
     }

 }





//3. Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)

fun ages(num:IntRange) {
    val n=1..1000
    while (n in num){
        if (n%6==0 && num%8==0){
         println("Bingo")
    }
    else if(num%6==0){
        println(num)
        }
        else if(num%8==0){
            println(num)
        }}
}


//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

class CurrentAccount(var accountNumber:String,var accountName:String, var balance:Int)

fun deposit(amount: Double):CurrentAccount{
    return amount+=balance

}
fun withdraw(amount: Double):CurrentAccount{
    var decrease=(amount-=balance)
    return decrease
}
fun details():CurrentAccount{
    var info="Account number $accountNumber with balance $balance is operated by $accountName"
    return
}


//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(var accountNumber:String,var accountName:String, var balance:Int, var withdrawals:Int)

fun savingsAccountWithdraw(number:Int){
    if (number<4){

    }
}













