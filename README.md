# CodeForces.1327A
Task link: http://codeforces.com/problemset/problem/1327/A
# Problem overview:
Given two integers: ```n```, ```k```. Return ```YES```, if ```n``` can be represented as a sum of ```k``` different odd terms, else return ```NO```.
<br/>
Input:
<br/>
At first, enter ```t``` - amount of tests, then run ```t``` tests: for each test enter a String, formatted as ```n``` ```k``` (```n```whitespace```k```)
# Solution overview:
At first, note that the lowest odd number is 1, then goes 3, 5, 7 and so on. Thus, the minimum sum of ```k``` different odd terms is 1 + 3 + 5 + ... + (2```k``` - 1), this sums up to ```k * k``` (https://math.stackexchange.com/questions/948128/what-is-the-proof-of-n2-1-3-5-2n-1), so, if ```n``` < ```k * k```, return ```NO```.
<br/>
Secondly, if ```n``` and ```k``` have different parity, also return ```NO``` because even amount of odd terms can't sum up to an odd number and vise versa.
<br/>
If we haven't returned ```NO``` before, we return ```YES```.
<br/>
Explanation:
<br/>
Consider sum 1 + 3 + 5 + (2 ```k``` - 1 + ```n``` - ```k * k```) = ```k * k``` + ```n``` - ```k * k``` = ```n```.
<br/>
Term (2 ```k``` - 1 + ```n``` - ```k * k```) is odd, hence 2 ```k``` - 1 is odd, ```n``` - ```k * k``` is even, odd + even = even, also last term is greater than (2 ```k``` - 1), so it is different from 1, 3, 5 and so on.
