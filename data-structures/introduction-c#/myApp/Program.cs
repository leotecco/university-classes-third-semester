using System;

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
            Aluno[] alunos = new Aluno[3];

            for (int i = 0; i < alunos.Length; i++)
            {
                Console.WriteLine("CADASTRO ALUNO " + (i + 1).ToString());
                Console.Write("NOME:");
                alunos[i].Nome = Console.ReadLine();
                Console.Write("RA:");
                alunos[i].RA = Console.ReadLine();
                Console.Write("NOTA 1:");
                alunos[i].Nota1 = Convert.ToDouble(Console.ReadLine());
                Console.Write("NOTA 2:");
                alunos[i].Nota2 = Convert.ToDouble(Console.ReadLine());
            }
        }
    }
}
