package Challenge_Tests;

import Challenge_Pages.DragDropPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDropTest_8 extends TestBase{
    DragDropPage DragObject ;

    @Test
    public void Drag()  {
        Action = new Actions(getDriver());
        DragObject = new DragDropPage(getDriver());
        getDriver().switchTo().frame(DragObject.Iframe);
        Action.dragAndDrop(DragObject.DragELE, DragObject.DropELE).build().perform();
    }

}
