package com.datastructures.trie;

public class TrieDriverProgram {
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("well");
		trie.insert("welcome");
		trie.insert("datastructure");
		trie.insert("data");
		trie.insert("structure");
		trie.insert("java");
		trie.insert("backend");
		trie.insert("javadeveloper");
		System.out.println(trie.search("java"));
		System.out.println(trie.startsWith("dat"));
	}
}
