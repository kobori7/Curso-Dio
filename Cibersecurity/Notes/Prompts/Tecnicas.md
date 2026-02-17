Instruções claras:  Técnica que organiza o Prompt para que as orientações sejam objetivas detalhadas e colocadas no inicio para maior clareza;

Prepara a saída: Defina palavras ou frases no final do Prompt qua ajudam moldar o formato da resposta, tornando-a mais estruturada e clara;

Solicitação de cadeia de Pensamento: Instrução para que o modelo responda passa a passo explicando o raciocínio até cha=egar a conclusão final;

Explicar Estrutura de saída: Indica o formato exato da resposta, como JSON, ou listas, ajudando a obter resultados organziados e úteis;

Repetir instruções no final: Reforça as orientações no final do Prompt para garantir que o modelo compreenda e siga a tarefa proposta sem dúvidas; 

Dividir a tarefa: Quebra uma tarefa complexa em várias etapas menores, facilitando para o modelo responde de forma lógica e organizada;

Adicionar Sintaxe clara: Organiza o Prompt com formatações como listas, títulos ou tabelas, tornando as instruções mais visuais e compreensíveis;

Guardrails: Técnica para limitar respostas, evitando conteúdos prejudiciais, irrelevantes e incorretos, alinhando o modelo de padrões éticos;

A engenharia de Large Language Models (LLMs) abrange um conjunto de técnicas para maximizar a precisão, relevância e eficiência de modelos de inteligência artificial generativa. Essas técnicas variam desde a elaboração de instruções (prompts) até a modificação do próprio modelo (fine-tuning) ou a integração com fontes de dados externas (RAG). 

Aqui estão as principais técnicas de engenharia para LLMs, divididas por categorias:

1. Engenharia de Prompts (Prompt Engineering) 
Técnicas focadas em estruturar a entrada (input) para obter o melhor resultado (output) do modelo. 

Zero-shot Prompting: Pedir ao modelo para realizar uma tarefa sem exemplos prévios, confiando no treinamento prévio.

Few-shot Prompting: Fornecer ao modelo alguns exemplos de entrada e saída no prompt para guiar o comportamento.

Chain-of-Thought (CoT) - Cadeia de Pensamento: Instruir o modelo a explicar seu raciocínio passo a passo antes de dar a resposta final, aumentando a precisão em tarefas lógicas.

Tree of Thoughts (ToT) - Árvore de Pensamento: Técnica avançada onde o modelo explora múltiplos caminhos de raciocínio (ramos) para resolver problemas complexos, avaliando qual é o melhor.

Self-Consistency: Pedir ao modelo várias respostas para o mesmo problema (via CoT) e escolher a mais frequente, aumentando a confiabilidade.

ReAct (Reason + Act): Combina o raciocínio (pensamento) com a ação (chamada de ferramentas externas), útil para agentes de IA.
Prompt Chaining (Encadeamento): Dividir uma tarefa complexa em prompts menores e sequenciais, onde a saída de um é a entrada do próximo. 

2. Recuperação de Informação e Aprimoramento (RAG)
Retrieval-Augmented Generation (RAG) é uma técnica que conecta o LLM a bases de dados externas (documentos, bancos vetoriais, internet) para fornecer informações atualizadas e reduzir alucinações. 

Processo RAG: O usuário faz uma pergunta 
 o sistema busca documentos relevantes em uma base de dados -> o prompt é "aumentado" com esses documentos -> o LLM gera a resposta baseada neles.
Embeddings: Transformar texto em vetores numéricos para busca de semelhança semântica. 

3. Ajuste Fino (Fine-Tuning)

Treinamento adicional de um modelo pré-treinado em um conjunto de dados específico para especializá-lo em uma tarefa ou domínio (ex: jurídico, médico). 
Supervised Fine-Tuning (SFT): Treinar o modelo com exemplos de pares pergunta-resposta de alta qualidade.

PEFT (Parameter-Efficient Fine-Tuning): Métodos como LoRA (Low-Rank Adaptation) que ajustam apenas uma pequena quantidade de parâmetros, reduzindo custos computacionais. 

4. Técnicas Estruturais e de Avaliação

System Prompts: Instruções gerais definidas no início da conversa que moldam o comportamento, tom e restrições do modelo.

Guardrails: Implementação de regras e filtros para garantir que as saídas da IA sejam seguras, éticas e não alucinadas.

Evaluations (Evals): Estruturas automatizadas para testar a qualidade das respostas do LLM, utilizando métricas ou outro LLM mais forte como juiz. 