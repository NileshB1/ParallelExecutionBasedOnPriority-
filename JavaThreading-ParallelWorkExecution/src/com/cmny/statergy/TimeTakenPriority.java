package com.cmny.statergy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cmny.task.Command;

public class TimeTakenPriority implements PriorityStrategy {

	@Override
	public List<Command> getPriorityStratergy(List<Command> commands) {
		Collections.sort(commands, new TimeTakenComparator());
		return commands;
	}

	class TimeTakenComparator implements Comparator<Command> {
		@Override
		public int compare(Command taskDetail1, Command taskDetail2) {
			int compare = 0;
			if (taskDetail2.getTimeTaken() < taskDetail1.getTimeTaken()) {
				compare = -1;
			} else if (taskDetail2.getTimeTaken() > taskDetail1.getTimeTaken()) {
				compare = 1;
			} else {
				compare = 0;
			}
			return compare;
		}
	}
}
