package ru.dinerik.factory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
