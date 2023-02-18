package com.thoughtworks.studios.javaexec;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class TestCommandExecutor extends CommandExecutor {
	public TestCommandExecutor(List<String> cmd) {
		super(cmd);
	}

	public TestCommandExecutor(List<String> cmd, Long timeout) {
		super(cmd, timeout);
	}

	public TestCommandExecutor(List<String> cmd, String workingDirectory) {
		super(cmd, workingDirectory);
	}

	public TestCommandExecutor(List<String> cmd, Long timeout, String workingDirectory) {
		super(cmd, timeout, workingDirectory);
	}

	@Override
	protected void processEnvironment(Map<String, String> environment) {
		environment.remove("JAVA_TOOL_OPTIONS");
	}
}
