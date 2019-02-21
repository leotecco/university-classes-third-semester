using System;
using System.Collections;
using System.Collections.Generic;

namespace myApp
{
    public struct Aluno
    {
        public string Nome;
        public string RA;
        public double Nota1;
        public double Nota2;
    }

    class Program
    {
        static void Main(string[] args)
        {
            Stack<string> s1 = new Stack<string>();
            Stack<string> s2 = new Stack<string>();

            s1.Push("word1");
            s1.Push("word2");
            s1.Push("word3");
            s1.Push("word4");

            Program.Transfere(s1, s2);

            Console.WriteLine("TRANFERE: ");
            Console.WriteLine(s1.Peek());
            Console.WriteLine(s2.Peek());
            Console.WriteLine("================");

            Stack<int> s3 = new Stack<int>();
            Stack<int> s4 = new Stack<int>();

            s3.Push(1);
            s3.Push(1);
            s3.Push(1);

            s4.Push(1);
            s4.Push(1);
            s4.Push(1);
            s4.Push(1);

            Console.WriteLine("MAIS ELEMENTOS: " + Program.MaisElementos(s3, s4).ToString().ToLower());
            Console.WriteLine("S3: " + Program.QuantidadeElementos(s3));
            Console.WriteLine("S4: " + Program.QuantidadeElementos(s4));
            Console.WriteLine("================");

            Stack<int> s5 = new Stack<int>();

            s5.Push(10);
            s5.Push(12);
            s5.Push(14);
            s5.Push(16);

            Console.WriteLine("ALGUM ELEMENTO IGUAL A 14: " + Program.AlgumElementoIgualAX(s5, 14));
            Console.WriteLine("ALGUM ELEMENTO IGUAL A 20: " + Program.AlgumElementoIgualAX(s5, 20));
            Console.WriteLine("S5: " + Program.QuantidadeElementos(s5));
            Console.WriteLine("================");
        }

        static void Transfere(Stack<string> s1, Stack<string> s2)
        {
            Stack<string> stackTemp = new Stack<string>();

            while (s1.Count > 0)
            {
                string stringTemp = s1.Pop();
                stackTemp.Push(stringTemp);
            }

            while (stackTemp.Count > 0)
            {
                string stringTemp = stackTemp.Pop();
                s1.Push(stringTemp);
                s2.Push(stringTemp);
            }
        }

        static int QuantidadeElementos(Stack<int> s1)
        {
            Stack<int> stackTemp = new Stack<int>();
            int s1Count = 0;

            while (s1.Count > 0)
            {
                int intTemp = s1.Pop();
                stackTemp.Push(intTemp);
                s1Count++;
            }

            while (stackTemp.Count > 0)
            {
                int intTemp = stackTemp.Pop();
                s1.Push(intTemp);
            }

            return s1Count;
        }

        static bool MaisElementos(Stack<int> s1, Stack<int> s2)
        {
            return Program.QuantidadeElementos(s1) > Program.QuantidadeElementos(s2);
        }

        static bool AlgumElementoIgualAX(Stack<int> s1, int value)
        {
            Stack<int> stackTemp = new Stack<int>();
            bool elementExists = false;

            while (s1.Count > 0 && !elementExists)
            {
                int intTemp = s1.Pop();
                stackTemp.Push(intTemp);

                if (intTemp == value)
                {
                    elementExists = true;
                }
            }

            while (stackTemp.Count > 0)
            {
                int intTemp = stackTemp.Pop();
                s1.Push(intTemp);
            }

            return elementExists;
        }

        static bool PilhasIguais(Stack<int> s1, Stack<int> s2)
        {
            if (Program.QuantidadeElementos(s1) != Program.QuantidadeElementos(s2))
            {
                return false;
            }

            Stack<int> stackTemp1 = new Stack<int>();
            Stack<int> stackTemp2 = new Stack<int>();
            bool stackEquals = true;

            while (s1.Count > 0 && stackEquals)
            {
                int intTemp1 = s1.Pop();
                int intTemp2 = s2.Pop();

                if (intTemp1 != intTemp2)
                {
                    stackEquals = false;
                }
            }

            return stackEquals;
        }
    }
}
