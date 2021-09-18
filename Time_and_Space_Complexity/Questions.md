# Questions

## Question 1
_What is the time complexity of fun()?_
```
int fun(int n)
{
  int count = 0;
  for (int i = 0; i < n; i++)
     for (int j = i; j > 0; j--)
        count = count + 1;
  return count;
}
```
### Solution 
O(nlogn), since in the inner loop we are running from i to zero and that will decrease the time complexity, i.e., the time will be lesser than O(n^2).
******

## Question 2
_What is time complexity of fun()?_
```
int fun(int n)
{
  int count = 0;
  for (int i = n; i > 0; i /= 2)
     for (int j = 0; j < i; j++)
        count += 1;
  return count;
}
```
### Solution
O(nlogn) since in first loop its decreasing logarithmically and in second loop increasing linearly.
******


## Question 3
_What is the time complexity of the below function?_

```
void fun(int n, int arr[])
{
    int i = 0, j = 0;
    for(; i < n; ++i)
        while(j < n && arr[i] < arr[j])
            j++;
}
```
### Solution
O(n) j can be incremented atmost n times.
******


## Question 4
_Consider the following two functions. What are time complexities of the functions?_
```
int fun1(int n)
{
    if (n <= 1) return n;
    return 2*fun1(n-1);
}

int fun2(int n)
{
    if (n <= 1) return n;
    return fun2(n-1) + fun2(n-1);
}
```
- a. O(2^n) for both fun1() and fun2()
- b. O(n) for fun1() and O(2^n) for fun2()
- c. O(2^n) for fun1() and O(n) for fun2()
- d. O(n) for both fun1() and fun2()
 
### Solution
Time complexity of fun1() can be written as
T(n) = T(n-1) + C which is O(n)

Time complexity of fun2() can be written as
T(n) = 2T(n-1) + C which is O(2^n)
******
 
 
## Question 5
_Consider the following C-function:_
```
double foo (int n)
{
    int i;
    double sum;
    if (n == 0) return 1.0;
    else
    {
        sum = 0.0;
        for (i = 0; i < n; i++)
            sum += foo (i);
        return sum;
    }
}
```
_The space complexity of the above function is:_

- (A) O(1)
- (B) O(n)
- (C) O(n!)
- (D) O(n*n)

### Solution
O(n) as for the worst time complexity the loop will execute n times.
******

## Question 6
In a competition, four different functions are observed. All the functions use a single for loop and within the for loop, same set of statements are executed. 
Consider the following for loops:

A) ```for(i = 0; i < n; i++)```
 
B) ```for(i = 0; i < n; i += 2)```
 
C) ```for(i = 1; i < n; i *= 2)```
 
D) ```for(i = n; i > -1; i /= 2)```

If n is the size of input(positive), which function is most efficient(if the task to be performed is not an issue)?

- (A)  A
- (B)  B
- (C)  C
- (D)  D

### Solution 
C. Because in first case the loop will execute n times, in second case it will be n/2, in third case it is log(n) time and if we closely observe then it is an infinite loop.
******

## Question 7 

Consider the following C function.
```
int fun1 (int n)
{
   int i, j, k, p, q = 0;
   for (i = 1; i<n; ++i)
   {
      p = 0;
      for (j = n; j > 1; j = j/2)
         ++p;
      for (k = 1; k < p; k = k*2)
         ++q;
   }
   return q;
}
```
Which one of the following most closely approximates the return value of the function fun1?
(GATE-CS-2015 -> Set 1)

- (A) n^3
- (B) n*(log(n))^2
- (C) n*log(n)
- (D) n*log(log(n))

### Solution 
C. Because inside a n times loop there will be two logn loop. Total of nlogn.
******

## Question 8

Let A[1, ..., n] be an array storing a bit (1 or 0) at each location, and f(m) is a function whose time complexity is θ(m). 
Consider the following program fragment written in a C like language:
counter = 0;
```
for (i = 1; i < = n; i++)
{ 
      if (A[i] == 1) 
         counter++;
      else {
         f(counter); 
         counter = 0;
      }
}
```
The complexity of this program fragment is
 ( GATE-CS-2004)

- (A) Ω(n^2)
- (B) Ω(n*log(n)) and O(n^2)
- (C) θ(n)
- (D) O(n)
### Solution 
Ans is C. All 1s take  θ(n), all 0s take  θ(n), half 0s and half 1s take θ(n). 


## Question 9

What is the time complexity of following function fun()?
Assume that log(x) returns log value in base 2.
```
void fun()
{
   int i, j;
   for (i=1; i<=n; i++)
      for (j=1; j<=log(i); j++)
         printf("GeeksforGeeks");
}
```
(A)  Θ(n)
(B)  Θ(n(log(n)))
(C)  Θ(n^2)
(D)  Θ(n^2*(log(n)))


## Question 10

What is the time and space complexity of the following dynamic programming algorithm 
used to find the maximum sub-array sum?
```
#include<stdio.h>
int max_num(int a,int b)
{
      if(a> b)
         return a;
      return b;
}
int maximum_subarray_sum(int *arr, int len)
{
      int sum[len], idx;
      sum[0] = arr[0];
      for(idx = 1; idx < len; idx++)
         sum[idx] = max_num(sum[idx - 1] + arr[idx], arr[idx]);
      int mx = sum[0];
      for(idx = 0; idx < len; idx++)
         if(sum[idx] > mx)
             mx =sum[idx];
         return mx;
}
int main()
{
      int arr[] = {-2, -5, 6, -2, 3, -1, 0,-5, 6}, len = 9;
      int ans = maximum_subarray_sum(arr, len);
      printf("%d",ans);
      return 0;
}
```
a) O(n) and O(n)
b) O(logn) and O(1)
c) O(nlogn) and O(n!)
d) O(n2) and O(n2)