# Java Master Practice Sheet 🚀

Ye practice sheet tumhe:

* Input
* Variables
* Operators
* Conditional Statements
* Loops
* Functions

me strong bana degi — especially DSA preparation ke liye.

---

# RULES FOR PRACTICE

✅ Har question khud solve karo
✅ Pehle logic socho
✅ Fir code likho
✅ Dry run karo
✅ Time complexity bhi socho
✅ Same question multiple ways me solve karo

---

# LEVELS

| Level   | Difficulty     |
| ------- | -------------- |
| Level 1 | Beginner       |
| Level 2 | Easy           |
| Level 3 | Medium         |
| Level 4 | DSA Foundation |
| Level 5 | Logic Building |

---

# PART 1 — INPUT PRACTICE

Use:

```java id="t97m36"
Scanner sc = new Scanner(System.in);
```

---

# Level 1 Input Questions

## Q1

User se naam input lo aur print karo.

---

## Q2

2 integers input lo aur unka sum print karo.

---

## Q3

Float input lo aur uska square print karo.

---

## Q4

Character input lo aur print karo.

Hint:

```java id="lvxaxm"
char ch = sc.next().charAt(0);
```

---

## Q5

Ek pura sentence input lo.

Use:

```java id="b0y5n2"
nextLine()
```

---

## Q6

Boolean input lo aur print karo.

---

## Q7

Age input lo aur:

```java id="fxecpa"
You are X years old
```

print karo.

---

## Q8

Length aur breadth input lo aur area print karo.

Area formula:
Area=length\times breadth

---

## Q9

Radius input lo aur circle area print karo.

Circle Area:
Area=\pi r^2

---

## Q10

3 numbers input lo aur average print karo.

Average:
Average=\frac{a+b+c}{3}

---

# PART 2 — VARIABLES PRACTICE

---

# Level 1

## Q11

Har primitive datatype ka variable banao:

* int
* double
* char
* boolean
* float
* long
* short
* byte

---

## Q12

Ek variable ki value dusre variable me copy karo.

---

## Q13

2 variables swap karo using third variable.

Swap Logic:
temp=a\Rightarrow a=b\Rightarrow b=temp

---

## Q14

2 variables swap without third variable.

Hint:

```java id="2n06yd"
a = a + b;
```

---

## Q15

Temperature Celsius to Fahrenheit convert karo.

Formula:
F=\frac{9}{5}C+32

---

## Q16

Seconds ko:

* hours
* minutes
* seconds
  me convert karo.

---

## Q17

Salary input lo aur yearly salary print karo.

---

## Q18

Simple interest calculate karo.

Formula:
SI=\frac{P\times R\times T}{100}

---

# PART 3 — OPERATORS PRACTICE

---

# Arithmetic Operators

## Q19

2 numbers par:

* +
* *
* *
* /
* %

apply karo.

---

## Q20

User se number lo aur square print karo.

---

## Q21

Cube print karo.

Cube:
a^3

---

# Relational Operators

## Q22

Check karo:

```java id="92pkx9"
a > b
```

---

## Q23

Check karo number equal hai ya nahi.

---

## Q24

Voting eligibility check karo.

Condition:

```java id="1s7j5c"
age >= 18
```

---

# Logical Operators

## Q25

Check:

* age > 18
* citizen == true

---

## Q26

Check karo number:

* positive
* even

---

## Q27

Check karo:

```java id="34jxjn"
number divisible by 5 AND 11
```

---

# Unary Operators

## Q28

Pre increment ka output predict karo.

```java id="awe7vb"
int a = 5;
System.out.println(++a);
```

---

## Q29

Post increment ka output predict karo.

---

## Q30

Pre/Post decrement practice.

---

# Assignment Operators

## Q31

Use:

```java id="u8e8kb"
+=
-=
*=
/=
```

---

# Ternary Operator

## Q32

Largest number using ternary operator.

Syntax:

```java id="d0m9lq"
condition ? true : false
```

---

# PART 4 — CONDITIONAL STATEMENTS

---

# if Statement

## Q33

Positive ya negative.

---

## Q34

Even odd.

---

## Q35

Eligible for driving license.

---

# if-else

## Q36

Largest of 2 numbers.

---

## Q37

Pass fail.

Condition:

```java id="5aqyrl"
marks >= 33
```

---

## Q38

Divisible by 7.

---

# if-else-if Ladder

## Q39

Greatest of 3 numbers.

---

## Q40

Grade system:

* A
* B
* C
* D

---

## Q41

Leap year.

Leap Year:
year%400==0\lor(year%4==0\land year%100!=0)

---

## Q42

Calculator:

* +
* *
* *
* /

---

# Nested if

## Q43

Login system:

* username
* password

---

## Q44

Check:

* positive
* even

---

# Switch Statement

## Q45

Day print:
1 → Monday

---

## Q46

Month print.

---

## Q47

Simple calculator using switch.

---

## Q48

Vowel or consonant.

---

# PART 5 — LOOPS PRACTICE

---

# for Loop

## Q49

1 to 10 print.

---

## Q50

1 to N.

---

## Q51

N to 1.

---

## Q52

Even numbers till N.

---

## Q53

Odd numbers till N.

---

## Q54

Table print.

Example:

```java id="q4kc95"
5 x 1 = 5
```

---

## Q55

Factorial using loop.

Factorial:
n!=n\times(n-1)\times(n-2)\dots1

---

## Q56

Sum of first N natural numbers.

Formula:
Sum=\frac{n(n+1)}{2}

---

## Q57

Reverse counting.

---

## Q58

Multiples of 3.

---

# while Loop

## Q59

1 to N print using while.

---

## Q60

Digits count karo.

Digits:
digits=\lfloor\log_{10}(n)\rfloor+1

---

## Q61

Reverse number.

---

## Q62

Palindrome number.

---

## Q63

Sum of digits.

---

## Q64

Product of digits.

---

## Q65

Prime number check.

---

# do-while

## Q66

Menu driven calculator.

---

## Q67

Repeat until user exits.

---

# Nested Loops

## Q68

Square pattern.

```java id="jlwm3e"
****
****
****
****
```

---

## Q69

Triangle pattern.

```java id="hnf5g9"
*
**
***
****
```

---

## Q70

Reverse triangle.

---

## Q71

Pyramid pattern.

---

## Q72

Number triangle.

```java id="txz1kk"
1
12
123
1234
```

---

## Q73

Floyd Triangle.

---

## Q74

Butterfly pattern.

---

## Q75

Diamond pattern.

---

# PART 6 — FUNCTIONS PRACTICE

---

# Beginner Functions

## Q76

Create:

```java id="0p24m3"
printHello()
```

---

## Q77

Create:

```java id="5k0vzd"
sum(int a, int b)
```

---

## Q78

Create:

```java id="jlwm6v"
square(int n)
```

Square:
n^2

---

## Q79

Create:

```java id="h87qij"
isEven()
```

---

## Q80

Create:

```java id="f93j6p"
isPrime()
```

---

## Q81

Create factorial function.

---

## Q82

Create max function.

---

## Q83

Create min function.

---

## Q84

Create average function.

---

## Q85

Create table printing function.

---

# Intermediate Functions

## Q86

Fibonacci function.

Fibonacci:
F(n)=F(n-1)+F(n-2)

---

## Q87

Palindrome function.

---

## Q88

Reverse number function.

---

## Q89

Digit count function.

---

## Q90

Power function.

Power:
a^b

---

# Recursion Practice

## Q91

Print 1 to N recursively.

---

## Q92

Print N to 1 recursively.

---

## Q93

Recursive factorial.

---

## Q94

Recursive fibonacci.

---

## Q95

Recursive sum of N numbers.

---

## Q96

Recursive power.

---

## Q97

Recursive reverse string.

---

## Q98

Recursive palindrome.

---

# PART 7 — MIXED LOGIC BUILDING

---

## Q99

ATM Machine.

---

## Q100

Mini calculator.

---

## Q101

Student grade system.

---

## Q102

Electricity bill calculator.

---

## Q103

BMI calculator.

BMI:
BMI=\frac{weight}{height^2}

---

## Q104

Number guessing game.

---

## Q105

Rock Paper Scissors.

---

## Q106

Find largest digit.

---

## Q107

Armstrong number.

Armstrong:
\sum digits^n

---

## Q108

Strong number.

---

## Q109

Perfect number.

---

## Q110

LCM and HCF.

HCF:
HCF(a,b)=HCF(b,a\bmod b)

---

# PART 8 — DSA FOUNDATION QUESTIONS

---

## Q111

Linear search function.

---

## Q112

Binary search function.

Binary Search:
mid=\frac{low+high}{2}

---

## Q113

Array sum function.

---

## Q114

Find maximum in array.

---

## Q115

Find minimum in array.

---

## Q116

Reverse array.

---

## Q117

Count even and odd.

---

## Q118

Second largest element.

---

## Q119

Array palindrome check.

---

## Q120

Frequency of elements.

---

# FINAL CHALLENGE SET 🔥

## Q121

Banking system.

---

## Q122

Student management system.

---

## Q123

Pattern generator.

---

## Q124

Recursive menu system.

---

## Q125

Mini quiz app.

---

# DAILY PRACTICE PLAN

| Day   | Topics            |
| ----- | ----------------- |
| Day 1 | Input + Variables |
| Day 2 | Operators         |
| Day 3 | Conditionals      |
| Day 4 | Loops             |
| Day 5 | Patterns          |
| Day 6 | Functions         |
| Day 7 | Recursion         |

---

# GOLDEN RULE FOR DSA

Har question me:

1. Input kya hai?
2. Output kya chahiye?
3. Loop lagega?
4. Condition lagegi?
5. Function ban sakta hai?
6. Dry run kya hoga?

---

# MOST IMPORTANT QUESTIONS ⭐

Sabse important:

* factorial
* fibonacci
* prime
* palindrome
* reverse number
* patterns
* recursion
* binary search
* functions

---

# NEXT STEP

Agar chaho to mai next me:

* in sabke solutions
* dry run
* handwritten notes style PDF
* interview questions
* 200 loop questions
* 100 function questions
* recursion master sheet
* pattern master sheet
* DSA beginner roadmap

bhi bana sakta hu.
