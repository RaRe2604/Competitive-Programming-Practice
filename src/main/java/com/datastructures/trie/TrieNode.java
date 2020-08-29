package com.datastructures.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	private Map<Character, TrieNode> children;
	private boolean isWordCompleted;
	private char character;

	public TrieNode() {
		this.children = new HashMap<>();
		this.isWordCompleted = false;
	}

	public TrieNode(char character) {
		this.children = new HashMap<>();
		this.isWordCompleted = false;
		this.setCharacter(character);
	}

	public Map<Character, TrieNode> getChildren() {
		return children;
	}

	public void setChildren(Map<Character, TrieNode> children) {
		this.children = children;
	}

	public boolean isWordCompleted() {
		return isWordCompleted;
	}

	public void setWordCompleted(boolean isWordCompleted) {
		this.isWordCompleted = isWordCompleted;
	}

	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

}
