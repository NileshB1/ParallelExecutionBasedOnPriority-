package com.cmny.statergy;

import java.util.List;

import com.cmny.task.Command;

public interface PriorityStrategy {
	public List<Command> getPriorityStratergy(List<Command> commands);
}
