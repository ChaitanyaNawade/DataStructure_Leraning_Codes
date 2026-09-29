#include<stdio.h>
#include<stdlib.h>

struct node 
{
    int data;
    struct node* next;
    struct node* prev;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void InsertFirst(PPNODE first , int no)
{
    PNODE newn = NULL;

    newn =(PNODE)malloc(sizeof(NODE));

    newn ->data = no;
    newn ->next = NULL;
    newn ->prev = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else 
    {
        newn->next = *first;
        (*first)->prev = newn;
        *first= newn;
    }
}

void InsertLast(PPNODE first , int no)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;
    newn->prev = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else 
    {
        temp = *first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }

        newn->prev = temp;
        temp->next = newn;
    }
}


void DeleteFirst(PPNODE first)
{
    if(*first == NULL)
    {
        return;
    }
    else if((*first)->next == NULL)
    {
        free(*first);
        *first = NULL;

    }
    else 
    {
        *first = (*first)->next;
        free((*first)->prev);
        (*first)->prev = NULL;
    }
}

void DeleteLast(PPNODE first)
{
    if(*first == NULL)
    {
        return;
    }
    else if((*first)->next == NULL)
    {
        free(*first);
        *first = NULL;
    }
    else 
    {
        PNODE temp = NULL;
        temp = *first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->prev->next = NULL;
        free(temp);
    }
}


void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("|%d|->",first->data);
        first = first->next;
    }
    printf("NULL\n");
}

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


void InsertAtPos(PPNODE first,int no , int pos)
{
    int iCount = Count(*first);
    PNODE newn = NULL;
    PNODE temp = NULL;

    if(pos < 0 || pos > iCount+1)
    {
        printf("Invalid Position\n");
        return;
    }
    
    if(pos == 1)
    {
        InsertFirst(first,no);
    }
    else if(pos == iCount+1)
    {
        InsertLast(first,no);
    }
    else 
    {
        temp = *first;
        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = no;
        newn->next = NULL;
        newn->prev = NULL;

        for(int i = 1; i < pos -1; i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        newn->next->prev =newn;
        temp->next = newn;
        newn->prev = temp;
    }
}

void DeleteAtPos(PPNODE first,int pos)
{
    PNODE temp = NULL;
    PNODE target = NULL;
    

    int iCount = Count(*first);

    if(pos < 0 || pos > iCount)
    {
        printf("Invalid Position \n");
        return;
    }

    if(pos == 1)
    {
        DeleteFirst(first);
    }
    else if(pos == iCount)
    {
        DeleteLast(first);
    }
    else 
    {
        temp = *first;

        for(int i = 1 ; i < pos-1; i++)
        {
            temp = temp->next;
        }

        target = temp->next;
        temp->next = target->next;
        target->next->prev = temp;
        free(target);
    }
    
}

int main()
{

    PNODE head = NULL;
    int iRet  = 0;

    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in linked list are : %d\n",iRet);


    InsertLast(&head,101);
    InsertLast(&head,111);
    InsertLast(&head,121);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in linked list are : %d\n",iRet);


    DeleteFirst(&head);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in linked list are : %d\n",iRet);

    DeleteLast(&head);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in linked list are : %d\n",iRet);


    InsertAtPos(&head,55,3);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in linked list are : %d\n",iRet);

    DeleteAtPos(&head,3);
    Display(head);
    iRet = Count(head);
    printf("The number of elements in linked list are : %d\n",iRet);

    return 0;
}