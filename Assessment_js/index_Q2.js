const flattenAndSort = (nestedArray) => {
  return [...new Set(nestedArray.flat())].sort((a, b) => a - b);
};

console.log(
  flattenAndSort([
    [3, 2, 1],
    [4, 5, 2],
    [1, 6],
  ])
);
// Output: [1, 2, 3, 4, 5, 6]
