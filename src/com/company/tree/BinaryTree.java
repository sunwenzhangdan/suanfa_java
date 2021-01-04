package com.company.tree;

public class BinaryTree<E> {

    public class Node<E>{
        E e;
        Node leftNode;
        Node  rightNode;

        public Node(E e) {
            this.e = e;
        }
    }

    private Node root;
    private int size;

    public BinaryTree(Node root, int sizs) {
        this.root = root;
        this.size = size;
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return size==0;
    }


    public void add(E e){
        if (root==null){
           root=new Node(e);
        }

    }


}

/*

二叉树总结

二叉树：



 */

/*
vim 编辑器总结
vim 看似简单的命令之中有着特殊的意义
i是在光标所在的字符之前插入需要录入的文本。
I 是在光标所在行的行首插入需要录入的文本。
a 是在光标所在的字符之后插入需要录入的文本。
A 是在光标所在行的行尾插入需要录入的文本。
o 是光标所在行的下一行行首插入需要录入的文本。
O 是光标所在行的上一行行首插入需要录入的文本。
s 删除光标所在处的字符然后插入需要录入的文本。
S 删除光标所在行，在当前行的行首开始插入需要录入的文本。

vim 与系统剪切板的内容交互
设置:set clipboard+=unnamed


 */
