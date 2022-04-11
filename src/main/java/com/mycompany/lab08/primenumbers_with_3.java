//Kevin Carpenter lab08
public class primenumbers_with_3//This function checks to see if the number that is passed contains the integer we are looking for, in this case it will be 3     
{  
static boolean containsDigit3(int number, int digit)
{
    while (number != 0)//This program keeps using modular 10 untill the passed number is 0, if at any point the number 3 shows up it will be passed back as true
    {
        int curr_digit = number % 10;
        if (curr_digit == digit) return true;
        number /= 10;//restarts the loop with a new value for number that removes a 10th place so we can check for the number 3
    }

    return false;//if value reaches 0 then returns false
}    
    
public static void main(String args[])   
{  
int count, sum = 0;
boolean three_check;//used to check if value has a 3

for(int number = 1; number <= 1000; number++) //We use this loop to go through every number from 1 - 1000 
{  
count = 0;


for (int i = 2; i <= number/2 ; i++)  //This counter stops when the counter is more then half of number becuase it can no longer be divided by the number and be prime
{        

    if(number % i == 0) //If there is a number that is divisable into our counter number then we add to the count which is later used to check if the number is prime or not 
{   
count++;//If this adds even once the number is not prime  
break;  
} 
    
}

three_check = containsDigit3(number,3);

if(count == 0 && number != 1 && three_check == true )  //We use our count here from before along with our three_check function to determine that our value fits what we are looking for and then add it to sum
{      
sum = sum + number;
    System.out.println(number);
}

} 

System.out.println("The Sum of Prime Numbers from 1 to 1000 with a 3 is: " + sum);  //Print out the final product and display our results
}
} 