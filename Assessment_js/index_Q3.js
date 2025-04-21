const getCategorySummary = (expenses) => {
  const categoryTotals = expenses.reduce((acc, expense) => {
    acc[expense.category] = (acc[expense.category] || 0) + expense.amount;
    return acc;
  }, {});

  const highestExpenseCategory = Object.keys(categoryTotals).reduce(
    (maxCategory, category) => {
      return categoryTotals[category] > (categoryTotals[maxCategory] || 0)
        ? category
        : maxCategory;
    },
    ""
  );

  return {
    ...categoryTotals,
    highestExpense: highestExpenseCategory,
  };
};

const expenses = [
  { category: "Food", amount: 120 },
  { category: "Travel", amount: 300 },
  { category: "Food", amount: 80 },
  { category: "Bills", amount: 200 },
  { category: "Travel", amount: 100 },
];

console.log(getCategorySummary(expenses));
// Output: { Food: 200, Travel: 400, Bills: 200, highestExpense: "Travel" }
