package pl.mloza.base.framework;

public interface PageObject {
    <T extends PageObject> PageObject goTo(Class<T> destination);
    PageObject open();
    PageObject waitForLoad();
}
