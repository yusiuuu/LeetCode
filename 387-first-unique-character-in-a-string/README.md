<h2>
  <a href="https://leetcode.com/problems/first-unique-character-in-a-string">
    First Unique Character in a String
  </a>
</h2>

<img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen" alt="Difficulty: Easy" />
<hr>

<p>
Given a string <code>s</code>, find the <strong>first</strong> non-repeating character in it and return its index.
If it <strong>does not</strong> exist, return <code>-1</code>.
</p>

<p>&nbsp;</p>

<h3>Approach 1: Frequency Array (Optimal)</h3>

<p>
This approach uses a fixed-size frequency array to count occurrences of each character.
Since the string contains only lowercase English letters, we use an array of size 26.
</p>

<p><strong>Algorithm:</strong></p>
<ol>
  <li>Traverse the string and count the frequency of each character.</li>
  <li>Traverse the string again and return the first index where frequency is 1.</li>
  <li>If no such character exists, return -1.</li>
</ol>

<p><strong>Visualization:</strong></p>

<pre>
String:  l  e  e  t  c  o  d  e
Index:   0  1  2  3  4  5  6  7

Frequency Count:
l → 1
e → 3
t → 1
c → 1
o → 1
d → 1

First character with frequency = 1 → 'l' (index 0)
</pre>

<p><strong>Code:</strong></p>

<pre>
<code>
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (int i = 0; i &lt; s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i &lt; s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
</code>
</pre>

<p><strong>Complexity:</strong></p>
<ul>
  <li>Time Complexity: <code>O(n)</code></li>
  <li>Space Complexity: <code>O(1)</code></li>
</ul>

<hr>

<h3>Approach 2: Queue + Frequency Array</h3>

<p>
This approach maintains the order of characters using a queue while tracking frequency.
Characters that repeat are removed from the queue.
The front of the queue always represents the first unique character.
</p>

<p><strong>Algorithm:</strong></p>
<ol>
  <li>Traverse the string.</li>
  <li>Update frequency and add character to queue.</li>
  <li>Remove characters from the queue whose frequency becomes greater than 1.</li>
  <li>The front of the queue is the first unique character.</li>
</ol>

<p><strong>Visualization:</strong></p>

<pre>
Input: "loveleetcode"

Queue progression:
[l]
[l, o]
[l, o, v]
[l, o, v, e]
(e repeats → removed)

Queue Front → 'l'
Index → 0
</pre>

<p><strong>Code:</strong></p>

<pre>
<code>
import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        Queue&lt;Character&gt; q = new LinkedList&lt;&gt;();

        for (int i = 0; i &lt; s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            q.offer(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] &gt; 1) {
                q.poll();
            }
        }

        if (q.isEmpty()) return -1;
        return s.indexOf(q.peek());
    }
}
</code>
</pre>

<p><strong>Complexity:</strong></p>
<ul>
  <li>Time Complexity: <code>O(n)</code></li>
  <li>Space Complexity: <code>O(n)</code></li>
</ul>

<hr>

<h3>Comparison</h3>

<table border="1" cellpadding="8">
  <tr>
    <th>Approach</th>
    <th>Time</th>
    <th>Space</th>
    <th>Recommended</th>
  </tr>
  <tr>
    <td>Frequency Array</td>
    <td>O(n)</td>
    <td>O(1)</td>
    <td>Yes ⭐</td>
  </tr>
  <tr>
    <td>Queue + Frequency</td>
    <td>O(n)</td>
    <td>O(n)</td>
    <td>Optional</td>
  </tr>
</table>
