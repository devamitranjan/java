package com.java;

public class SublistSearch
{
  boolean findList(Node first, Node second)
  {
    Node ptr1 = first;
    Node ptr2 = second;
    
    if(first == null && second == null)
    {
      return true;
    }
    
    if(first == null || second == null)
    {
      return false;
    }
    
    while(second!= null)
    {
      ptr2 = second;
      while(ptr1!= null)
      {
        if(ptr2 == null)
        {
          return false;
        }
        else if(ptr1.data == ptr2.data)
        {
          ptr1 = ptr1.next;
          ptr2 = ptr2.next;
        }
        else
        {
          break;
        }
      }
      return false;
    }
  }
  
  void printList(Node node)
  {
    while(node!= null)
    {
      System.out.println(node.data);
      node = node.next;
    }
  }
  
  Node newNode(int key)
  {
    Node temp = new Node;
    temp.data = key;
    temp.next = null;
    return temp;
  }
  
  public static void main(String[] args)
  {
    Node a = newNode(1);
    a.next = newNode(2);
    a.next.next = newNode(3);
    a.next.next.next = newNode(4);
    
    Node b = newNode(1);
    b.next = newNode(2);
    b.next.next = newNode(1);
    b.next.next.next = newNode(2);
    b.next.next.next.next = newNode(3);
    b.next.next.next.next.next = newNode(4);
    
    findList(a,b)?System.out.println("List Found"):System.out.println("List not found");
  }
}
      