package br.com.samiac.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<>();

		for (String email : emails) {
			String[] split = email.split("@");
			String local = split[0];
			String domain = split[1];

			int plusIndex = local.indexOf("+");

			if (plusIndex != -1) {
				local = local.substring(0, plusIndex);
			}

			local = local.replace(".", "");

			set.add(local + "@" + domain);
		}

		return set.size();
	}
}
