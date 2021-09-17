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
O(n^2)
```

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
O(nlogn)

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
```O(n)

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
Ans is b.

## Question 5
_Consider the following C-function:_
```
double foo (int n)
{
    int i;
    double sum;
    if (n = = 0) return 1.0;
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
  Ans is B
