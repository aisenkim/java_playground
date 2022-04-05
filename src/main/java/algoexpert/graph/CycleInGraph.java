package algoexpert.graph;

import java.util.*;

/**
 * [IDEA]
 *  
 * Perform dfs on all the nodes (represented by idx) 
 * Use auxillary data structure 
 * 1. Keep track of visited nodes 
 * 2. Keep track of the nodes currently in the stack
 *
 */

public class CycleInGraph {
	public boolean cycleInGraph(int[][] edges) {
		// init auxillary
		boolean[] visited = new boolean[edges.length];	
		boolean[] inStack = new boolean[edges.length];

		// loop through "edges" and perform DFS
		for(int i = 0; i < edges.length; i++) {
			if(visited[i]) continue;
			boolean hasCycle = checkNeighbors(i, visited, inStack, edges);
			if(hasCycle) return true;
		}

		return false;
	}

	private boolean checkNeighbors(
			int nodeIdx, boolean[] visited, boolean[] inStack, int[][] edges) {

		visited[nodeIdx] = true;
		inStack[nodeIdx] = true;

		boolean hasCycle = false;
		for(int neighbor : edges[nodeIdx]) {
			if(!visited[neighbor])
				hasCycle = checkNeighbors(neighbor, visited, inStack, edges);	
			if(inStack[neighbor] || hasCycle) return true;
		}
		


		inStack[nodeIdx] = false;
		return false;
	}
}

