# Building-a-Graph-Data-Structure
Q: Describe in your own words what the HashMap does. A: HashMap is a data structure that allows you to store and retrieve values using keys. It provides a way to map a unique key to a specific value, and then later retrieve that value using the same key.

Under the hood, a HashMap uses a hash function to convert the key into an index in an array. The value is then stored in the corresponding array location. When you want to retrieve the value, the hash function is used again to find the index of the value in the array, and then it can be retrieved from there.

One of the key benefits of using a HashMap is that it provides constant time complexity for insertion and retrieval operations on average, making it a highly efficient data structure. It is commonly used in programming to quickly look up values based on a key, such as in databases or when working with large datasets.

Q: Why is it important to check to see if the HashMap already contains a Vertex?

A: Checking if a HashMap already contains a Vertex is important because HashMap is designed to store unique key-value pairs. If we try to insert a key-value pair into a HashMap using a key that already exists, it will overwrite the existing value associated with that key.

In the context of a graph data structure, where each Vertex represents a node in the graph, it is important to ensure that each node is unique. If we try to insert a duplicate Vertex into the HashMap, we may accidentally overwrite an existing Vertex with the same key, which can lead to incorrect graph traversal and processing.

By checking if a HashMap already contains a Vertex before inserting it, we can ensure that each Vertex is unique and prevent accidental overwriting. This helps to maintain the integrity of the graph data structure and ensure that it behaves as intended.
