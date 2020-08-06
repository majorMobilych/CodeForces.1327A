# CodeForces.1327A
Task link: http://codeforces.com/problemset/problem/1327/A
# Problem overview:
Given two inegers: ```n```, ```k```. Return ```YES```, if ```n``` can be represented as a sum of ```k``` different odd terms, else return ```NO```.
# Solution overiew:
At first, note that the lowest odd number is 1, then goes 3, 5, 7 and so on. Thus, the minimum sum of ```k``` different odd terms is 1 + 3 + 5 + ... + (2```k``` - 1), this sums up to ```k * k``` (https://math.stackexchange.com/questions/948128/what-is-the-proof-of-n2-1-3-5-2n-1), so, if ```n``` < ```k * k```, return ```NO```.
<br/>
Secondly, if ```n``` and ```k``` have different parity, also return ```NO``` beacause even amount of odd terms can't sum up to an odd number and vise versa.
<br/>
If we haven't returned ```NO``` before, we return ```YES```.
<br/>
Explanation: consider sum 1 + 3 + 5 + (2 ```k``` - 1 + ```n``` - ```k * k```) = ```k * k``` + ```n``` - ```k * k``` = ```n``` - term (2 ```k``` - 1 + ```n``` - ```k * k```) is odd add greater than (2 ```k``` - 1)
