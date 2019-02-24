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

            Console.WriteLine("ALGUM ELEMENTO IGUAL A 14: " + Program.AlgumElementoIgualAX(s5, 14).ToString().ToLower());
            Console.WriteLine("ALGUM ELEMENTO IGUAL A 20: " + Program.AlgumElementoIgualAX(s5, 20).ToString().ToLower());
            Console.WriteLine("S5: " + Program.QuantidadeElementos(s5));
            Console.WriteLine("================");

            Stack<int> s6 = new Stack<int>();
            Stack<int> s7 = new Stack<int>();
            Stack<int> s8 = new Stack<int>();
            Stack<int> s9 = new Stack<int>();
            Stack<int> s10 = new Stack<int>();
            Stack<int> s11 = new Stack<int>();

            s6.Push(10);
            s6.Push(12);
            s6.Push(14);
            s6.Push(16);

            s7.Push(10);
            s7.Push(12);
            s7.Push(14);
            s7.Push(16);

            s8.Push(10);
            s8.Push(12);
            s8.Push(14);
            s8.Push(18);

            s11.Push(10);
            s11.Push(12);
            s11.Push(14);

            Console.WriteLine("PILHAS IGUAIS: " + Program.PilhasIguais(s6, s7).ToString().ToLower());
            Console.WriteLine("PILHAS IGUAIS: " + Program.PilhasIguais(s7, s8).ToString().ToLower());
            Console.WriteLine("PILHAS IGUAIS: " + Program.PilhasIguais(s9, s10).ToString().ToLower());
            Console.WriteLine("PILHAS IGUAIS: " + Program.PilhasIguais(s6, s11).ToString().ToLower());
            Console.WriteLine(s6.Peek());
            Console.WriteLine(s7.Peek());
            Console.WriteLine(s8.Peek());
            Console.WriteLine(s11.Peek());
            Console.WriteLine("================");

            Stack<int> s12 = new Stack<int>();

            s12.Push(10);
            s12.Push(12);
            s12.Push(14);
            s12.Push(16);

            Console.WriteLine("REMOVE ELEMENTO X DA PILHA: " + Program.RemoveElementoXDaPilha(s12, 14).ToString().ToLower());
            Console.WriteLine(s12.Peek());
            Console.WriteLine("REMOVE ELEMENTO X DA PILHA: " + Program.RemoveElementoXDaPilha(s12, 14).ToString().ToLower());
            Console.WriteLine(s12.Peek());
            Console.WriteLine("REMOVE ELEMENTO X DA PILHA: " + Program.RemoveElementoXDaPilha(s12, 16).ToString().ToLower());
            Console.WriteLine(s12.Peek());
            Console.WriteLine("REMOVE ELEMENTO X DA PILHA: " + Program.RemoveElementoXDaPilha(s12, 12).ToString().ToLower());
            Console.WriteLine(s12.Peek());
            Console.WriteLine("================");

            Stack<char> s13 = new Stack<char>();
            s13.Push('D');
            s13.Push('B');
            s13.Push('A');
            s13.Push('B');
            s13.Push('B');
            s13.Push('A');

            s13.Push('C');

            s13.Push('A');
            s13.Push('B');
            s13.Push('B');
            s13.Push('A');
            s13.Push('B');
            s13.Push('D');

            Stack<char> s14 = new Stack<char>();
            s14.Push('D');
            s14.Push('B');
            s14.Push('A');
            s14.Push('B');
            s14.Push('B');
            s14.Push('A');

            s14.Push('C');

            s14.Push('A');
            s14.Push('B');
            s14.Push('B');
            s14.Push('A');
            s14.Push('B');
            s14.Push('A');

            Console.WriteLine("INVERSO DOS CARACTERES: " + Program.InversoDosCaracteres(s13).ToString().ToLower());
            Console.WriteLine(s13.Peek());
            Console.WriteLine("INVERSO DOS CARACTERES: " + Program.InversoDosCaracteres(s14).ToString().ToLower());
            Console.WriteLine(s14.Peek());
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

        static int QuantidadeElementosChar(Stack<char> s1)
        {
            Stack<char> stackTemp = new Stack<char>();
            int s1Count = 0;

            while (s1.Count > 0)
            {
                char charTemp = s1.Pop();
                stackTemp.Push(charTemp);
                s1Count++;
            }

            while (stackTemp.Count > 0)
            {
                char charTemp = stackTemp.Pop();
                s1.Push(charTemp);
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

                stackTemp1.Push(intTemp1);
                stackTemp2.Push(intTemp2);

                if (intTemp1 != intTemp2)
                {
                    stackEquals = false;
                }
            }

            while (stackTemp1.Count > 0)
            {
                int intTemp1 = stackTemp1.Pop();
                int intTemp2 = stackTemp2.Pop();

                s1.Push(intTemp1);
                s2.Push(intTemp2);
            }

            return stackEquals;
        }

        static bool PilhasIguaisChar(Stack<char> s1, Stack<char> s2)
        {
            if (Program.QuantidadeElementosChar(s1) != Program.QuantidadeElementosChar(s2))
            {
                return false;
            }

            Stack<char> stackTemp1 = new Stack<char>();
            Stack<char> stackTemp2 = new Stack<char>();
            bool stackEquals = true;

            while (s1.Count > 0 && stackEquals)
            {
                char charTemp1 = s1.Pop();
                char charTemp2 = s2.Pop();

                stackTemp1.Push(charTemp1);
                stackTemp2.Push(charTemp2);

                if (charTemp1 != charTemp2)
                {
                    stackEquals = false;
                }
            }

            while (stackTemp1.Count > 0)
            {
                char charTemp1 = stackTemp1.Pop();
                char charTemp2 = stackTemp2.Pop();

                s1.Push(charTemp1);
                s2.Push(charTemp2);
            }

            return stackEquals;
        }

        static bool RemoveElementoXDaPilha(Stack<int> s1, int x)
        {
            Stack<int> stackTemp = new Stack<int>();
            bool elementoEncontrado = false;

            while (s1.Count > 0 && !elementoEncontrado)
            {
                int intTemp = s1.Pop();

                if (intTemp == x)
                {
                    elementoEncontrado = true;
                }
                else
                {
                    stackTemp.Push(intTemp);
                }
            }

            while (stackTemp.Count > 0)
            {
                int intTemp = stackTemp.Pop();
                s1.Push(intTemp);
            }

            return elementoEncontrado;
        }

        static bool InversoDosCaracteres(Stack<char> s1)
        {
            Stack<char> s2 = new Stack<char>();
            char caractereAtual = ' ';
            bool inversoDosCaracteres = false;

            while ((caractereAtual = s1.Pop()) != 'C')
            {
                s2.Push(caractereAtual);
            }

            inversoDosCaracteres = Program.PilhasIguaisChar(s1, s2);

            s1.Push('C');
            while (s2.Count > 0)
            {
                char charTemp = s2.Pop();
                s1.Push(charTemp);
            }

            return inversoDosCaracteres;
        }
    }
}
