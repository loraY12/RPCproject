# RPCproject
# Java RPC Client-Server Application

## Description
This project implements a simple Remote Procedure Call (RPC) mechanism 
using Java Socket Programming.

The client sends a number to the server, and the server determines whether the number is:
- Even or Odd
- Prime or Not Prime

The server then sends the result back to the client.

---

## Technologies Used
- Java
- Socket Programming
- ObjectInputStream
- ObjectOutputStream
- Exception Handling

---

## How It Works
1. The server starts and waits for a connection on port 1234.
2. The client connects to localhost.
3. The client sends a number to the server.
4. The server processes the number.
5. The server sends back the result to the client.

---

## Example Output

Server:
Server started...
Client connected.

Client:
Enter a number: 7
Server Response: 7 is Odd and Prime

---

## Learning Outcomes
- Understanding Client-Server architecture
- Implementing a basic RPC mechanism
- Working with Java networking
- Handling exceptions properly

---

## Author
Developed as part of a Java Networking practice project.
