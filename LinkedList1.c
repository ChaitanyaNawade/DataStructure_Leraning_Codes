#include<stdio.h>
#include<stdlib.h>

//Singly Linear Linked List
// |11|->|21|->|21|->|51|->|101|->NULL

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

////////////////////////////////////////////////InsertFirst
void InsertFirst(PPNODE first , int no)
{
     PNODE newn = NULL;
     newn =(PNODE)malloc(sizeof(NODE));

     newn->data = no;
     newn->next = NULL;

     if(*first == NULL)   //LL is empty
     {
        *first = newn;
     }
     else                 //LL Contains Atleats one element
     {
        newn->next = *first;
        *first = newn;
     }
}

/////////////////////////////////////////////////////InsertLast
void InsertLast(PPNODE first , int no)
{
    PNODE newn = NULL;
    PNODE temp = NULL;
 
    newn =(PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

    if(*first == NULL)   //LL is empty
    {
        *first = newn;
    } 
    else                 //LL Contains Atleats one element
    {
        temp = *first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newn;
    }
}


//////////////////////////////////////////InsertAtPos 

void InsertAtPos(PPNODE first , int data , int pos)
{
    
}


////////////////////////////////////////////////////Display
void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d |->",first->data);
        first = first ->next;
    }
    printf("NULL\n");
}


////////////////////////////////////////////////////////Count
int Count(PNODE first)
{
    int iCount = 0;

    while(first != NULL)
    {
        iCount++;
        first = first->next;
    }

    return iCount;
}

int main()
{
    int iRet = 0;
    PNODE head = NULL;

    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    Display(head);
    iRet = Count(head);
    printf("Total number of elements in linked list is : %d\n",iRet);

    InsertLast(&head,101);
    Display(head);
    iRet = Count(head);
    printf("Total number of elements in linked list is : %d\n",iRet);

    return 0;
}