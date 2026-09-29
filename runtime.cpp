#include<iostream>
using namespace std;

class Base 
{
    public :

    virtual void fun()
    {
        cout<<"Base fun\n";
    }

    virtual void gun()
    {
        cout<<"Base gun\n";
    }

    virtual void sun()
    {
        cout<<"Base sun\n";
    }

    void run()
    {
        cout<<"Base run";
    }
};

class Derived : public Base 
{
    void fun()
    {
        cout<<"Derived fun\n";
    }

    virtual void gun()
    {
        cout<<"Derived gun\n";
    }

    virtual void run()
    {
        cout<<"Derived run\n";
    }

    virtual void mun()
    {
        cout<<"Derived mun\n";
    }
};

int main()
{
    Base *ptr = NULL;
    Derived dobj;
    ptr = &dobj;
    ptr->fun();   //Derived run
    ptr->gun();   //Derived gun
    ptr->sun();   //Base sun
    ptr->run();   //Base run
    return 0;
}