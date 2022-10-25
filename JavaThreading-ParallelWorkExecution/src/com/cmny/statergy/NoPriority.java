package com.cmny.statergy;

import java.util.List;

import com.cmny.task.Command;

public class NoPriority implements PriorityStrategy {

	@Override
	public List<Command> getPriorityStratergy(List<Command> commands) {
		return commands;
	}
}
