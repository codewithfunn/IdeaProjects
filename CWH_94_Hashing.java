package com.company;

public class CWH_94_Hashing {
    public static void main(String[] args){
        /*
        * Hashing in java
            Hashing is the technique to convert the range of Key-value pairs to a range of indices.
            In hashing, we use hash functions to map keys to some values.
            * Example:
                Let arr = [ 11, 33,22,14 ]
                hashIndex = (key%10)

    | Keys |             | H(x)= Keys%10  |               |  HashTable |

      11------11%10=1-------------------------------             0
      33------33%10=3-------------------------      ^----------->1
      22------22%10=2------------------------|------------------>2
      14------14%10=4--------------          |------------------>3
                                  |----------------------------->4

Collision: the hash function may map two key values to a single index. Such a situation is known as a collision.
    Example : Let y = [71,22,42,64]


      | Keys |             | H(x)= Keys%10  |               |  HashTable |

      71------71%10=1-------------------------------             0
      22------22%10=2-------------------------      ^----------->1
                                             |
      42------42%10=2------------------------^------------------>2 (22,42)
      64------64%10=4--------------                              3
                                  |----------------------------->4

    * In the above image ,you can see that the 22 , 42 are mapped to the index number 2.
    * we need to avoid the collision. Following technique are used to avoid collision in hashing:
        * Open Addressing
        * chaining
          */
    }
}
