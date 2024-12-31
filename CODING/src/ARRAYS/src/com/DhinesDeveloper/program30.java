package com.DhinesDeveloper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Group anagram togther
public class program30 {
	private static List<List<String>> groupAnagramsTogther(String[] strs){
		List<List<String>> res = new ArrayList<>();
		HashMap<String,List<String>> map  =new HashMap<>();
		for(String str:strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);

			if(map.containsKey(key)) map.get(key).add(str);
			else {
				List<String> strList = new ArrayList<>();
				strList.add(str);
				map.put(key, strList);
			}

		}
		res.addAll(map.values());
		return res;
	}
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> groupAnagramsTogther = groupAnagramsTogther(strs);
		System.out.println(groupAnagramsTogther);
	}
//[[eat, tea, ate], [bat], [tan, nat]]
}
