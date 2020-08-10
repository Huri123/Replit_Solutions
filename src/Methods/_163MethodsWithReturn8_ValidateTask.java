package Methods;

/*
Instructions from your teacher:
We have a to do list app, every time a user adds a task - a few things needed to be checked.

It should not be empty (boolean parameter needs to be true)
taskId should be only 1 greater than currentID. for example if we have 7 tasks(currentId is 7) so the next task id is 8 , it can't be 10.


for example:

validateTask(true,2,1)
returns true

validateTask(true,3,1)
returns false

validateTask(false,3,2)
returns false

 */
public class _163MethodsWithReturn8_ValidateTask {
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        if (notEmpty==true&&taskId==currentId+1){
            return true;
        }else{
            return false;
        }


    }
}
