package timetracker

data class Action(val command: Command, val timestamp: Long = System.currentTimeMillis())
