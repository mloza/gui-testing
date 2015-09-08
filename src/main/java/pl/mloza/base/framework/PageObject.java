package pl.mloza.base.framework;

/**
 * Created by scroot on 08.09.2015.
 */
public interface PageObject {
    <T extends PageObject> PageObject goTo(Class<T> destination);
    PageObject open();
    PageObject waitForLoad();
}
