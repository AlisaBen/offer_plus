# offer_plus

## Java写算法题常用的操作

### 字符串
1. `.length()`
2. `.toCharArray()`
3. `.charAt(index)`
4. `.substring(start_index, end_index?)`
5. `String.valueOf(123)` 数字转字符串
5. `Integer.valueOf("+123")` 字符串转数字
```java
String s = "af+f_fe ";
System.out.println(s.length()); // 字符串长度
char[] strArr = s.toCharArray();
System.out.println(Arrays.toString(strArr)); // [a, f, +, f, _, f, e,  ]
System.out.println(strArr.length); // 数组长度
// String s1 = Arrays.toString(strArr);
// System.out.println(s1);
char c = s.charAt(0); // a
String s1 = s.substring(1); // 从1之后的所有字符串
String s2 = s.substring(1,3);
System.out.println("s1:" + s1 + " s2: " + s2);
Integer num = Integer.valueOf("+123"); // 字符串转换数字
System.out.println(num);
String s3 = String.valueOf(num); // 数字转换字符串
System.out.println(s3);
```
### 数组
1. `.length`
2. `Arrays.sort(array)`
3. `array[index]`
4. `new int[]{}`, `new int[4]`
5. `Arrays.asList(array)` 数组转换成列表

```java
int[] arr = new int[]{3,1,5,3,4};
Arrays.sort(arr); // 应用排序会直接改变数组
System.out.println(Arrays.toString(arr)); // [1, 3, 3, 4, 5]
System.out.println(arr[3]); // 4
```
### 列表ArrayList
1. `ArrayList<Integer> list = new ArrayList<>()`
2. `.add()`, `.addAll(list)`
3. `.remove(index)`, `remove(object)`
4. `.set(index,object)`
5. `.get(index)`
6. `.indexOf(object)` 没有返回-1
7. `Integer[] array = list.toArray(new Integer[len])`
8. `.contains(object)` return boolean
9. `.isEmpty()`
10. `.clear()`

```java

//---------------ArrayList--------------//
ArrayList<Integer> barray = new ArrayList<>();
barray.add(6);
barray.add(7);
ArrayList<Integer> array = new ArrayList<>();
array.add(3);
array.add(4);
array.addAll(barray);
System.out.println(array); // [3, 4, 6, 7]
System.out.println(array.size()); // 4
boolean contain = array.contains(4); // 是否包含某个元素 true
Integer x = array.get(2); // 6
System.out.println(x); // 6
System.out.println(contain);
int index = array.indexOf(3); // 0
int notIndex = array.indexOf(0); // -1
System.out.println(index + " not:" + notIndex);
System.out.println(array.isEmpty()); // false
array.remove(3); // 超出索引会报错
System.out.println(array); // [3, 4, 6]如果是整数就默认是索引
array.set(0, 45);
System.out.println(array); // [45, 4, 6]

Object[] intarr = new Object[array.size()];
intarr = array.toArray();
Integer[] intarr1 = array.toArray(new Integer[array.size()]); // 把列表转换称数组
List<Integer> ss = Arrays.asList(intarr1);
System.out.println(ss); // [45, 4, 6]

array.clear();
System.out.println(intarr[0]);

```

### Map
1. `Map<Integer, Integer> map = new HashMap<Integer, Integer>()`
2. `.put(key,value)`
3. `.get(key)` 没有key返回null
4. `.containsKey(key)`
5. `.remove(key)`  没有key返回null
6. `.size()`
7. `.isEmpty()`
8. `.keySet()`
9. `.entrySet()`


```java
System.out.println("------------------------");
Map<Integer, Integer> map = new HashMap<Integer, Integer>();
map.put(3,2);
map.put(2,4);
map.put(2,5);
map.put(6,7);
System.out.println(map);//{2=5, 3=2, 6=7}
Integer a = map.get(10);
System.out.println(a); // null
Integer b = map.get(2);
System.out.println(b); // 5
Integer res = map.remove(10); // 没有就是null,有就返回对应的数字
System.out.println(res); // 5
System.out.println(map);
Set<Integer> keySet = map.keySet();
Iterator<Integer> it = keySet.iterator();
while(it.hasNext()) {
    Integer key = it.next();
    Integer value = map.get(key);
    System.out.println("key:" + key + " value: " + value);
}
Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
Iterator<Map.Entry<Integer,Integer>> itt = entrySet.iterator();
while(itt.hasNext()) {
    Map.Entry<Integer,Integer> entry = itt.next();
    Integer key = entry.getKey();
    Integer value = entry.getValue();
    System.out.println("key:" + key + " value: " + value);
}
boolean flag = map.containsKey(2);
boolean empty = map.isEmpty();
int size = map.size();
map.clear();
```


leetcode题解

## week 1
