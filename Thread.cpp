#include<iostream>
#include<thread>

using namespace std;

void Display()
{
    cout<<"Hello Thread"<<endl;
}

int main()
{
    std::thread t(Display);

    t.join();

    return 0;
}