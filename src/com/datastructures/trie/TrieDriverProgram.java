package com.datastructures.trie;

public class TrieDriverProgram {
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("rahul");
		trie.insert("demo");
		trie.insert("dex");
		trie.insert("dexter");
		trie.insert("demoed");
		System.out.println(trie.search("ra"));
		System.out.println(trie.startsWith("rax"));
	}
}
