    /*
     * Copyright (c) 2020.
     * Author: Himanshu Gautam
     * Email: himanshu.gautam@guavus.com
     */

    package Test;

    /**
     * check if a binary tree is subtree of other
     * https://leetcode.com/problems/subtree-of-another-tree/
     *
     * CASE1: tree1 present in tree 2 as subtree
     *      Tree1
     *      x
     *     / \
     *    a   b
     *     \
     *      c
     *  inorder:  a c x b
     *  preorder: x a c b
     *      Tree2
     *       z
     *      /  \
     *     x    e
     *    /\     \
     *   a  b     k
     *    \
     *     c
     *  inorder:  a c x b z e k
     *  preorder: z x a c b e k
     *
     * CASE2 : tree 1 is present in tree 2 but NOT as subtree
     *     Tree1
     *      x
     *     / \
     *    a   b
     *   /
     *  c
     *  inorder:  c a x b
     *  preorder: x a c b
     *       Tree 2
     *       x
     *      /\
     *     a  b
     *    /    \
     *   c     d
     *  inorder: c a x b d
     * preorder: x a c b d
     * Note:  such cases by adding a special character whenever we encounter NULL in inorder and preorder traversals
     */

    /**
     *
     */
    public class CheckSubtree {

        void storeInorderr(Node node, char arr[], Movement i){
            if(node == null){
                arr[i.i++] = '$'; // delimeter
                return;
            }
            storeInorderr(node.left, arr, i);
            arr[i.i++] = node.data;
            storeInorderr(node.right, arr, i);
        }
        void storePreOrder(Node node, char arr[], Movement i){
            if(node == null){
                arr[i.i++] = '$'; return;
            }
            arr[i.i++] = node.data;
            storePreOrder(node.left, arr, i);
            storePreOrder(node.right, arr, i);
        }

        /**
         * IS Q A SUBTEE OF P ??
         * @param p = ROOT OF TREE 1
         * @param q =  ROOT OF TREE 2
         * @return
         */
        boolean isSubtree(Node p, Node q){
            if(q == null) return true;
            if(p == null) return false;

            char inP[] = new char[100];
            char inQ[] = new char[100];
            Movement pIndex = new Movement(0);
            Movement qIndex = new Movement(0);
            storeInorderr(p, inP, pIndex);
            storeInorderr(q, inQ, qIndex);
            if(Movement.checkSubstring(String.valueOf(inP).substring(0, pIndex.i),
                    String.valueOf(inQ).substring(0, qIndex.i)) == null){
                return false;
            }

            pIndex = new Movement(0);
            qIndex = new Movement(0);
            char preP[] = new char[100];
            char preQ[] = new char[100];
            storePreOrder(p, preP, pIndex);
            storePreOrder(q, preQ, qIndex);
            if(Movement.checkSubstring(String.valueOf(preP).substring(0, pIndex.i),
                    String.valueOf(preQ).substring(0, qIndex.i)) == null){
                return false;
            }

            return true;
        }

        public static void main(String[] args) {
            CheckSubtree tree = new CheckSubtree();
            Node t = new Node('a');
            t.left = new Node('b');
            t.right = new Node('d');
            t.left.left = new Node('c');
            t.right.right = new Node('e');

            Node u = new Node('a');
            u.left = new Node('b');
            u.right = new Node('d');
            u.left.left = new Node('c');

            System.out.println(
                    tree.isSubtree(t, u)
            );


            Node a = new Node('x');
            a.left = new Node('a');
            a.right = new Node('b');
            a.left.right = new Node('c');
            Node b = new Node('z');
            b.left = new Node('x');
            b.right = new Node('e');
            b.left.left = new Node('a');
            b.left.right = new Node('b');
            b.left.left.right = new Node('c');
            b.right.right = new Node('k');
            System.out.println(
                    tree.isSubtree(b, a)
            );

    //        System.out.println(
    //                Movement.checkSubstring("zxa$c$$b$$e$k$$", "xa$c$$b$$")
    //        );
        }
    }

    /**
     * to store data related to events when null node(leaf node) encountered
     */
    class Movement {
        int i; // index of array into which nodes stored (both inorder, preorder cases)
        int m = 0;
        int n = 0;

        public Movement(int i) {
            this.i = i;
        }

        /**
         * simple looping and searching needle in haystack
         * @param haystack
         * @param needle
         * @return
         */
        static String checkSubstring(String haystack, String needle){
            if(haystack == null || needle == null) return null;
            int hLength = haystack.length();
            int nLength = needle.length();
            if(hLength < nLength) return null;
            if(nLength == 0) return haystack;
            for(int i=0;i<=hLength - nLength;++i){
                // loop till first char matches
                if(haystack.charAt(i) == needle.charAt(0)){
                    int j = 0;
                    while(j < nLength){
                        if(haystack.charAt(i+j) != needle.charAt(j))
                            break;
                        ++j;
                    }
                    if(j == nLength) return haystack.substring(i);
                }
            }
            return null;
        }
    }
    class Node {
        char data;
        Node left, right;
        Node(char item){
            data = item;
            left = right = null;
        }
    }

