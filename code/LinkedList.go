package main

import "fmt"
import "errors"
import "log"
type Node struct {
  index int 
  data int
  next_node *Node
}
type List struct {
  head *Node
  size int
}

func (list *List) add(node *Node) (*Node, error) {
  if node == nil {
    return nil, errors.New("You can't add a nil node")
  }
  if list.head == nil {
    list.head = node
    node.index = 0
    list.size++
    return node, nil
  }
  current := list.head
  for current.next_node != nil {
    current = current.next_node
  }
  node.index = current.index + 1
  current.next_node = node
  list.size++
  return node, nil
}
 
func (list *List) get(index int) (*Node, error) {
  if list.head == nil {
    return nil, errors.New("The list is empty")
  }
  if index > list.size || index < 0 {
    return nil, errors.New("index < 0 or index > list .size")
  }
  if index == 0 {
    return list.head, nil
  }
  current := list.head
  for current != nil {
    if current.index == index {
      return current, nil
    }
    current = current.next_node
  }
  return nil, errors.New("Can't find the node")
}

func (list *List) iter(index int) map[int]*Node {
  if list.head == nil {
    return nil
  }
  var m map[int]*Node
  m = make(map[int]*Node)
  for i := index; i < list.size; i++ {
    node, err := list.get(i)
    if err != nil {
      log.Fatal(err)
    }
    m[node.index] = node
  }
  return m
}


