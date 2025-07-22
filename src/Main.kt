
fun printDone(list:List<Task>){
    for (task in list){
        if(task.isDone){ println("${task.title} -- ✅")}
    }
}

fun printNotDone(list:List<Task>){
    for (task in list){
        if(!task.isDone){ println("${task.title} -- ❌") }
    }
}

fun printAll(list:MutableList<Task>){
    for (task in list){
        println("${task.title} -- ${ if (task.isDone) "✅" else "❌"}")
    }
}

fun main(){
    val t1 = Task("Task submission", false)
    val t2 = Task("Breakfast", true)
    val t3 = Task("Session recap", true)
    val taskList = mutableListOf(t1, t2, t3)
    println("All:")
    printAll(taskList)
    println("Done:")
    printDone(taskList)
    println("Missing:")
    printNotDone(taskList)
}

data class Task(val title:String, var isDone :Boolean){}