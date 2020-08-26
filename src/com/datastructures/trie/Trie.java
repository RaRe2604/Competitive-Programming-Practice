package com.datastructures.trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {
	private static TrieNode root = new TrieNode();

	public void insert(String word) {
		TrieNode current = root;
		for (char character : word.toCharArray()) {
			current = current.getChildren().computeIfAbsent(character, c -> new TrieNode(c));
		}
		current.setWordCompleted(true);
	}

	public boolean search(String word) {
		TrieNode current = searchNode(word);
		return current != null && current.isWordCompleted();
	}

	private TrieNode searchNode(String word) {
		TrieNode current = root;
		for (char character : word.toCharArray()) {
			if (current.getChildren() != null && current.getChildren().containsKey(character)) {
				current = current.getChildren().get(character);
			} else {
				return null;
			}
		}
		return current;
	}

	public boolean startsWith(String word) {
		return searchNode(word) != null;
	}
}